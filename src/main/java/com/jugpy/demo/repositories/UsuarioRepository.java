package com.jugpy.demo.repositories;

import com.jugpy.demo.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by william on 1/5/18.
 */
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    Usuario findByEmail(String email);
}
