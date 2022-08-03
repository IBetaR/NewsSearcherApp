package com.informatorio.newsapp.service;

import com.informatorio.newsapp.mapper.AuthorInDTOtoAuthor;
import com.informatorio.newsapp.persistence.entity.Author;
import com.informatorio.newsapp.persistence.repository.AuthorRepository;
import com.informatorio.newsapp.service.dto.AuthorInDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AuthorService {

    //@Autowired
    private final AuthorRepository authorRepository;
    private final AuthorInDTOtoAuthor mapper;

    public AuthorService(AuthorRepository authorRepository, AuthorInDTOtoAuthor mapper) {
        this.authorRepository = authorRepository;
        this.mapper = mapper;
    }

    public Author createAuthor(AuthorInDTO authorInDTO){
        Author author = mapper.map(authorInDTO);
        return this.authorRepository.save(author);
    }

    public List<Author> getAuthors() {
        return this.authorRepository.findAll();
    }

//    public List<Author> getAuthorsByCreatedDate(LocalDate authorCreatedAt) {
//        return this.authorRepository.findAll(authorCreatedAt);
//    }
}
