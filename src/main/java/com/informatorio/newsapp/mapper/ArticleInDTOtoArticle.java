package com.informatorio.newsapp.mapper;

import com.informatorio.newsapp.persistence.entity.Article;
import com.informatorio.newsapp.service.dto.ArticleInDTO;
import org.springframework.stereotype.Component;

@Component
public class ArticleInDTOtoArticle implements IMapper<ArticleInDTO, Article> {

    @Override
    public Article map(ArticleInDTO in) {
        Article article = new Article();
        article.setTitle(in.getTitle());
        article.setDescription(in.getDescription());
        article.setUrl(in.getUrl());
        article.setUrlToImage(in.getUrlToImage());
        article.setPublishedAt(in.getPublishedAt());
        article.setContent(in.getContent());
        //article.setAuthor(in.getAuthor());
        //article.setSource(in.getSource());
        return article;
    }
}
