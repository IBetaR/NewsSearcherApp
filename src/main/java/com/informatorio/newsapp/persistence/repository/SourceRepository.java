package com.informatorio.newsapp.persistence.repository;

import com.informatorio.newsapp.persistence.entity.Source;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SourceRepository extends JpaRepository<Source, Long> {
}
