package com.hakim.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EntrepriseDto {
    private Integer id;
    private String nom;
}
