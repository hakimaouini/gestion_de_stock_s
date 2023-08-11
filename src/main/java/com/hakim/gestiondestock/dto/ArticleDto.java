package com.hakim.gestiondestock.dto;

import com.hakim.gestiondestock.model.Category;
import com.hakim.gestiondestock.model.MvStk;

import java.math.BigDecimal;
import java.util.List;


public class ArticleDto {
    private Integer id;
    private String codeArticle;

    private String designation;

    private BigDecimal prixUnitaireHt;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitairTtc;

    private String photo;

    private List<MvStk> mvStks;

    private CategoryDto category;
}
