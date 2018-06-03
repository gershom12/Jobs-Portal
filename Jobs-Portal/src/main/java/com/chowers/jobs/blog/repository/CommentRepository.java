package com.chowers.jobs.blog.repository;


import com.chowers.jobs.blog.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
