package com.newsfeed.newsfeed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.newsfeed.newsfeed.entity.Attachment;
@Repository
public interface AttachmentRepository extends JpaRepository <Attachment,Long> {
    
}
