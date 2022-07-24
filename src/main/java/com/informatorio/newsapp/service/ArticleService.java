package com.informatorio.newsapp.service;

import com.informatorio.newsapp.mapper.ArticleInDTOtoArticle;
import com.informatorio.newsapp.persistence.entity.Article;
import com.informatorio.newsapp.persistence.repository.ArticleRepository;
import com.informatorio.newsapp.service.dto.ArticleInDTO;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;
    private final ArticleInDTOtoArticle mapper;

    public ArticleService(ArticleRepository articleRepository, ArticleInDTOtoArticle mapper) {
        this.articleRepository = articleRepository;
        this.mapper = mapper;
    }

    public Article createArticle(ArticleInDTO articleInDTO) {
        Article article = mapper.map(articleInDTO);
        return this.articleRepository.save(article);
    }
}
