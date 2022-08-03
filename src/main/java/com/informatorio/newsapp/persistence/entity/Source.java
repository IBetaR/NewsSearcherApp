package com.informatorio.newsapp.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "source")
public class Source {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String code;
    private LocalDate createdAt;

    public Source() {
    }

    @OneToMany(mappedBy = "source", cascade = CascadeType.ALL)
    public Set<Article> articles = new HashSet<>();

    public Set<Article> getArticles() {
        return articles;
    }
}
