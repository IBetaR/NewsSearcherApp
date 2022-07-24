package com.informatorio.newsapp.service;

import com.informatorio.newsapp.mapper.SourceInDTOtoSource;
import com.informatorio.newsapp.persistence.entity.Source;
import com.informatorio.newsapp.persistence.repository.SourceRepository;
import com.informatorio.newsapp.service.dto.SourceInDTO;
import org.springframework.stereotype.Service;

@Service
public class SourceService {

    private final SourceRepository sourceRepository;
    private final SourceInDTOtoSource mapper;

    public SourceService(SourceRepository sourceRepository, SourceInDTOtoSource mapper) {
        this.sourceRepository = sourceRepository;
        this.mapper = mapper;
    }

    public Source createSource(SourceInDTO sourceInDTO){
        Source source = mapper.map(sourceInDTO);
        return this.sourceRepository.save(source);
    }
}
