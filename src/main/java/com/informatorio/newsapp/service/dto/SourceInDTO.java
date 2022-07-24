package com.informatorio.newsapp.service.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class SourceInDTO {

    private String name;
    private String code;
    private LocalDate createdAt;
}
