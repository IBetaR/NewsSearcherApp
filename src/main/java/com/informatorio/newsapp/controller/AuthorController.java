package com.informatorio.newsapp.controller;

import com.informatorio.newsapp.persistence.entity.Author;
import com.informatorio.newsapp.service.AuthorService;
import com.informatorio.newsapp.service.dto.AuthorInDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping("/create")
    public Author createAuthor(@RequestBody AuthorInDTO authorInDTO){
        return this.authorService.createAuthor(authorInDTO);
    }
}
