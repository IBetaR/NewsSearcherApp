package com.informatorio.newsapp.mapper;

import com.informatorio.newsapp.persistence.entity.Author;
import com.informatorio.newsapp.service.dto.AuthorInDTO;
import org.springframework.stereotype.Component;

@Component
public class AuthorInDTOtoAuthor implements IMapper <AuthorInDTO, Author>{

    @Override
    public Author map(AuthorInDTO in) {
        Author author =new Author();
        author.setFirstname(in.getFirstname());
        author.setLastname(in.getLastname());
        author.setCreatedAt(in.getCreatedAt());
        return author;
    }
}
