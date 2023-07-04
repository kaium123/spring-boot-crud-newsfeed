package com.newsfeed.newsfeed.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class PostResponse {

    private String content;
    private String attachmentName;

    public PostResponse(String content, String attachmentName) {
        this.content = content;
        this.attachmentName = attachmentName;
    }
}
