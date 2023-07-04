package com.newsfeed.newsfeed.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newsfeed.newsfeed.dto.PostResponse;
import com.newsfeed.newsfeed.entity.Post;
import com.newsfeed.newsfeed.repository.PostRepository;

import lombok.AllArgsConstructor;

import com.newsfeed.newsfeed.repository.AttachmentRepository;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@RestController
@RequestMapping(value = "/newsfeed")
public class PostController {
    @Autowired
    private PostRepository postRepository;
    private AttachmentRepository attachmentRepository;
    //private final modelMapper modelMapper;

    @PostMapping("/create")
    public Post placeOrder(@RequestBody Post request){
        System.out.println(request);
       return postRepository.save(request);
    }

    @GetMapping("/list")
    public List<Post> findAllOrders(){
        return postRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Post> findByID(@PathVariable("id") Integer id){
        return postRepository.findById(id);
    }

    @PutMapping("/update/{id}")
    public Post updatePost(@PathVariable("id") Long id,@RequestBody Post request){
        request.setId(id);
        return postRepository.save(request);
    }

    @GetMapping("/getInfo")
    public List<PostResponse> getJoinInformation(){
        return postRepository.getJoinInformation();
    }
}
