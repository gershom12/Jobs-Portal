package com.chowers.jobs.blog.services;

import com.chowers.jobs.blog.entities.Comment;
import java.util.List;



public class CommentServiceImpl implements CommentService 
{

    public List<Comment> getComments(Long postId)
    {
        return null;
    }

    public void saveComment(Comment comment)
    {
        
    }
    
    public boolean updateComment(Long id)
    {
        return true;
    }

    public boolean deleteComment(Long id)
    {
        return true;
    }
}