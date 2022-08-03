package com.informatorio.newsapp.controller;

import com.informatorio.newsapp.persistence.entity.Source;
import com.informatorio.newsapp.persistence.entity.SourceCode;
import com.informatorio.newsapp.service.SourceService;
import com.informatorio.newsapp.service.dto.SourceInDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/newsapp/sources")
public class SourceController {

    private final SourceService sourceService;

    public SourceController(SourceService sourceService) {
        this.sourceService = sourceService;
    }

    @PostMapping("/create")
    public Source createSource(@RequestBody SourceInDTO sourceInDTO){
        return this.sourceService.createSource(sourceInDTO);
    }

    @GetMapping("/search")
    public ResponseEntity<?> search (@RequestParam String code){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(sourceService.search(code));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e + "Error en SourceController" + "\"}" ));
        }
    }


//    @GetMapping("/webpages")
//    public List<Source> findAllByCode (@RequestParam SourceCode sourceCode) throws Exception {
//        try {
//            return this.sourceService.findAllByCode(sourceCode);
//        }catch (Exception exception){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e + "Error en SourceController" + "\"}" ));
////    }
    @GetMapping("/webpages")
    public ResponseEntity<?> findAllByCode (@RequestParam SourceCode code){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(sourceService.findAllByCode(code));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e + "Error en SourceController" + "\"}" ));
        }
    }

}
