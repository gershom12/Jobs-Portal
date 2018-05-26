package com.chowers.jobs.blog.services;


import com.chowers.jobs.blog.entities.Post;
import com.chowers.jobs.blog.entities.User;
import com.chowers.jobs.blog.repositories.PostRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;



public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository)
    {
       this.postRepository = postRepository; 
    }
    
    @Override
    public List<Post> getAllPosts()
    {
        return postRepository.findAll();
    }

    @Override
    public void addPost(Post post)
    {
       postRepository.save(post);
    }

    @Override
    public List<Post> findByUser(User user)
    {
       return postRepository.findByCreatorId(user.getId());
    }
    
    @Override
    public boolean deletePost(Long postId)
    {
        Post thePost = postRepository.findOne(postId);
        if(thePost == null)
            return false;
        postRepository.delete(postId);
        return true;
    }
    
    @Override
    public Post getPost(Long id)
    {
        return postRepository.findOne(id);
    }
    
    @Override
    public Post find(Long postId) {
        return postRepository.findOne(postId);
    }
}
