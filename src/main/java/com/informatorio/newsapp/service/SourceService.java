package com.informatorio.newsapp.service;

import com.informatorio.newsapp.mapper.SourceInDTOtoSource;
import com.informatorio.newsapp.persistence.entity.Source;
import com.informatorio.newsapp.persistence.entity.SourceCode;
import com.informatorio.newsapp.persistence.repository.SourceRepository;
import com.informatorio.newsapp.service.dto.SourceInDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SourceService {

    //@Autowired
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


    public List<Source> search(String filter) throws Exception{
        try {
            List<Source> sources = sourceRepository.search(filter);
            return sources;
        }catch (Exception exception){
            throw new Exception("Fuente no encontrada. ");
        }
    }

        public List<Source> findAllByCode(SourceCode sourceCode) throws Exception{
        try {
            return this.sourceRepository.findAllByCode(sourceCode);
        }catch (Exception exception){
            throw new Exception("No existe. ");
        }
    }

//    public List<Source> Search(String filter) throws Exception{
//        try {
//            List<Source> sources = sourceRepository.findAllByCode(SourceCode.valueOf(filter));
//            return sources;
//        }catch (Exception exception){
//            throw new Exception("Fuente no encontrada. ");
//        }
//    }
}
