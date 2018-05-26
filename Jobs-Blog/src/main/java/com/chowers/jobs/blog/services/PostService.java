package com.chowers.jobs.blog.services;

import com.chowers.jobs.blog.entities.Post;
import com.chowers.jobs.blog.entities.User;
import java.util.List;

public interface PostService {

    

    public List<Post> getAllPosts();
    
    public void addPost(Post post);

    public List<Post> findByUser(User user);

    public boolean deletePost(Long postId);
    
    public Post getPost(Long id);
    
     public Post find(Long postId);
}

