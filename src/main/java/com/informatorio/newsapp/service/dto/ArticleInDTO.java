package com.informatorio.newsapp.service.dto;

import com.informatorio.newsapp.persistence.entity.Author;
import com.informatorio.newsapp.persistence.entity.Source;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ArticleInDTO {

    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private LocalDate publishedAt;
    private String content;
    //private Author author;
    //private Source source;
}
