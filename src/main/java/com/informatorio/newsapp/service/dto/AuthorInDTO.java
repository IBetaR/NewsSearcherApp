package com.informatorio.newsapp.service.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class AuthorInDTO {

    private String firstname;
    private String lastname;
    private LocalDate createdAt;
}
