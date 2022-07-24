package com.informatorio.newsapp.controller;

import com.informatorio.newsapp.persistence.entity.Source;
import com.informatorio.newsapp.service.SourceService;
import com.informatorio.newsapp.service.dto.SourceInDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sources")
public class SourceController {
    private final SourceService sourceService;


    public SourceController(SourceService sourceService) {
        this.sourceService = sourceService;
    }

    @PostMapping("/create")
    public Source createSource(@RequestBody SourceInDTO sourceInDTO){
        return this.sourceService.createSource(sourceInDTO);
    }
}
