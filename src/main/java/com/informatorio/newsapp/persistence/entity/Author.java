package com.informatorio.newsapp.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    private String lastname;
    private String fullname;
    private LocalDate createdAt;

    public Author() {
    }

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    public Set<Article> articles = new HashSet<>();

    public Set<Article> getArticles() {
        return articles;
    }
}
