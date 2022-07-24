package com.informatorio.newsapp.service;

import com.informatorio.newsapp.mapper.AuthorInDTOtoAuthor;
import com.informatorio.newsapp.persistence.entity.Author;
import com.informatorio.newsapp.persistence.repository.AuthorRepository;
import com.informatorio.newsapp.service.dto.AuthorInDTO;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

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
}
