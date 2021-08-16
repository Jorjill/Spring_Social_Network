package com.jorjill.reddit.repository;

import com.jorjill.reddit.model.Post;
import com.jorjill.reddit.model.Subreddit;
import com.jorjill.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);
    List<Post> findByUser(User user);
}
