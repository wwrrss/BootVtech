package com.jugpy.demo.controllers

import com.jugpy.demo.models.Post
import com.jugpy.demo.repositories.PostRepository
import com.jugpy.demo.repositories.UsuarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.Authentication
import org.springframework.web.bind.annotation.*

/**
 * Created by william on 1/8/18.
 */
@RestController
@RequestMapping("/posts")
@CrossOrigin(origins = arrayOf("http://localhost:4200"),allowCredentials = "true")
class PostController (val repository: PostRepository,val usuarioRepository: UsuarioRepository) {




    @GetMapping("/")
    fun findAll() = repository.findAll()

    @GetMapping("/{id}")
    fun findbyId(@PathVariable("id") id:Int) = repository.findById(id).orElse(null)

    @PostMapping("/")
    fun save(@RequestBody post:Post,authentication:Authentication):Post{
        post.usuario = usuarioRepository.findByEmail(authentication.name)
        return repository.save(post)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable(name = "id")id:Int):Int{
        repository.deleteById(id)
        return id
    }

}