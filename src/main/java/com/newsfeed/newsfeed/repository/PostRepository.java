package com.newsfeed.newsfeed.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.newsfeed.newsfeed.dto.PostResponse;
import com.newsfeed.newsfeed.entity.Post;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Integer> {

   @Query("SELECT new com.newsfeed.newsfeed.dto.PostResponse(p.content, a.name) FROM Post p JOIN p.attachments a")
   public List<PostResponse> getJoinInformation();

}

