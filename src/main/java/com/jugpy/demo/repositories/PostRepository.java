package com.jugpy.demo.repositories;

import com.jugpy.demo.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by william on 1/8/18.
 */
public interface PostRepository extends JpaRepository<Post,Integer> {

}
