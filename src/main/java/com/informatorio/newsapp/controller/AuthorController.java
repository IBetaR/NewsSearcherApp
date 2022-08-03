package com.informatorio.newsapp.controller;

import com.informatorio.newsapp.persistence.entity.Author;
import com.informatorio.newsapp.service.AuthorService;
import com.informatorio.newsapp.service.dto.AuthorInDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/newsapp/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping("/create")
    public Author createAuthor(@RequestBody AuthorInDTO authorInDTO){
        return this.authorService.createAuthor(authorInDTO);
    }

    @GetMapping("")
    public List<Author> getAuthors(){
        return this.authorService.getAuthors();
    }

//    @GetMapping("/datecreated/{createdAt}")
//    public List<Author> getAuthorsByCreatedDate(@PathVariable ("createdAt") LocalDate localDate){
//        return this.authorService.getAuthorsByCreatedDate(localDate);
//    }

}
