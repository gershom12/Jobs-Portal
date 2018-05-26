package com.chowers.jobs.blog.services;


import com.chowers.jobs.blog.entities.Comment;
import java.util.List;


public interface CommentService {

    public List<Comment> getComments(Long postId);

    public void saveOrUpdateComment(Comment comment);

    public boolean deleteComment(Long id);
    
}
