package com.chowers.jobs.blog.services;

import com.chowers.jobs.blog.entities.Comment;
import com.chowers.jobs.blog.repositories.CommentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;



public class CommentServiceImpl implements CommentService 
{
    @Autowired
    private CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository postRepository)
    {
       this.commentRepository = postRepository; 
    }
    
    @Override
    public List<Comment> getComments(Long postId)
    {
         return commentRepository.findByPostId(postId);
    }

    @Override
    public void saveOrUpdateComment(Comment comment)
    {
         commentRepository.save(comment);
    }
    
    @Override
    public boolean deleteComment(Long id)
    {
        Comment comment = commentRepository.findOne(id);
        if(comment == null)
            return false;
        commentRepository.delete(id);
        return true;
    }
}