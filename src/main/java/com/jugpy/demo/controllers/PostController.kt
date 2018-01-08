package com.jugpy.demo.controllers

import com.jugpy.demo.models.Post
import com.jugpy.demo.repositories.PostRepository
import org.springframework.web.bind.annotation.*

/**
 * Created by william on 1/8/18.
 */
@RestController
@RequestMapping("/posts")
class PostController (val repository: PostRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAll()

    @GetMapping("/{id}")
    fun findbyId(@PathVariable("id") id:Int) = repository.findById(id).orElse(null)

    @PostMapping("/")
    fun save(@RequestBody post:Post) = repository.save(post)

}