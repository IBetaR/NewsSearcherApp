package com.informatorio.newsapp.controller;

import com.informatorio.newsapp.persistence.entity.Article;
import com.informatorio.newsapp.service.ArticleService;
import com.informatorio.newsapp.service.dto.ArticleInDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping("/create")
    public Article createArticle(@RequestBody ArticleInDTO articleInDTO){
        return this.articleService.createArticle(articleInDTO);
    }
}
