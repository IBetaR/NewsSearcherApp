package com.informatorio.newsapp.service;

import com.informatorio.newsapp.mapper.ArticleInDTOtoArticle;
import com.informatorio.newsapp.persistence.entity.Article;
import com.informatorio.newsapp.persistence.repository.ArticleRepository;
import com.informatorio.newsapp.service.dto.ArticleInDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
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

    public List<Article> getArticles(){
        return articleRepository.findAll();
    }

//    public List<Article> getAll() { return articleRepository.findAll();
//    }

    public boolean getArticlesByWord(ArticleInDTO o){
        return articleRepository.findAll().contains(mapper.map(o));
    }

    public Optional<Article> getArticleById(Long id){
        return articleRepository.findById(id);
    }

    public void updateArticle(ArticleInDTO articleInDTO){
        Article article = mapper.map(articleInDTO);
        this.articleRepository.save(article);
    }

    public Optional<Article> updateArticleById(Long id) {
        return articleRepository.findById(id);
    }

    public void deleteArticleById(Long id) {
        articleRepository.deleteById(id);
    }


}
