package com.example.week7.ripository;

import com.example.week7.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findPostByUserId(Long userId);
}
