package com.informatorio.newsapp.persistence.repository;

import com.informatorio.newsapp.persistence.entity.Source;
import com.informatorio.newsapp.persistence.entity.SourceCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SourceRepository extends JpaRepository<Source, Long> {


    @Query(
            value = "SELECT * FROM source WHERE source.code like %:code%", nativeQuery = true
    )
    List<Source> search (@Param("code") String code);

    @Query(
            value = "SELECT * FROM source WHERE source.code like %:code%", nativeQuery = true
    )
    List<Source> findAllByCode(@Param("code") SourceCode sourceCode);

}
