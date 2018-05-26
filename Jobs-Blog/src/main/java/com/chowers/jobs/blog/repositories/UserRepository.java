package com.chowers.jobs.blog.repositories;


import com.chowers.jobs.blog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User repository for CRUD operations.
 */

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
