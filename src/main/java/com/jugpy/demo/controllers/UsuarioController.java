package com.jugpy.demo.controllers;

import com.jugpy.demo.models.Usuario;
import com.jugpy.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by william on 1/5/18.
 */
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping(value = "/")
    public List<Usuario> getPersonas(){
        return usuarioRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Usuario getById(@PathVariable("id") Integer id){
        return usuarioRepository.findById(id).orElse(null);
    }

    @PostMapping(value = "/")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity save(@RequestBody Usuario usuario){
        if(usuario.getId()!=null&&usuario.getId()!=0){
            return new ResponseEntity("Solo para guardar nuevas entidades", HttpStatus.BAD_REQUEST);
        }
        //Encode del password que viene como texto plano a Bcrypt
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        return new ResponseEntity(usuarioRepository.save(usuario),HttpStatus.CREATED);
    }
}
