package com.informatorio.newsapp.persistence.repository;

import com.informatorio.newsapp.persistence.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

//    List<Author> findAll(LocalDate authorCreatedAt);
}
