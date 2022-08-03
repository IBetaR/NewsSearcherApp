package com.informatorio.newsapp.controller;

import com.informatorio.newsapp.persistence.entity.Article;
import com.informatorio.newsapp.service.ArticleService;
import com.informatorio.newsapp.service.dto.ArticleInDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/newsapp/articles")
//@CrossOrigin("http://localhost:3000")
@CrossOrigin("*")
public class ArticleController {


    private final ArticleService articleService;

    //@Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

//    @GetMapping("")
//    public ResponseEntity<?> getAll(){
//        try {
//            return ResponseEntity.status(HttpStatus.OK).body(articleService.getAll());
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Intente mas tarde.\"}");
//        }
//    }

    @PostMapping("/create")
    public Article createArticle(@RequestBody ArticleInDTO articleInDTO){
        return this.articleService.createArticle(articleInDTO);
    }

    @GetMapping("")
    public List<Article> getArticles(){
        return articleService.getArticles();
    }

    
    @GetMapping("/{o}")
    public boolean getArticlesByWord(ArticleInDTO o){
        return articleService.getArticlesByWord(o);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Article> getArticleById(@PathVariable Long id){
        return articleService.getArticleById(id);
    }

    @PutMapping("/update")
    public void updateArticle(@RequestBody ArticleInDTO articleInDTO){
        articleService.updateArticle(articleInDTO);
    }

    @PutMapping("/update/{id}")
    @ResponseBody
    public Optional<Article> updateArticleById(@PathVariable Long id){
        return articleService.updateArticleById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteArticleById(@PathVariable Long id){
        articleService.deleteArticleById(id);
    }





}
