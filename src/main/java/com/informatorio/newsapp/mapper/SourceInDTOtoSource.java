package com.informatorio.newsapp.mapper;

import com.informatorio.newsapp.persistence.entity.Source;
import com.informatorio.newsapp.service.dto.SourceInDTO;
import org.springframework.stereotype.Component;

@Component
public class SourceInDTOtoSource implements IMapper<SourceInDTO, Source>{

    @Override
    public Source map(SourceInDTO in) {
        Source source = new Source();
        source.setName(in.getName());
        source.setCode(in.getCode());
        source.setCreatedAt(in.getCreatedAt());
        return source;
    }
}
