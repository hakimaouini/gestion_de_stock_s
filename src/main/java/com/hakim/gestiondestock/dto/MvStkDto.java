package com.hakim.gestiondestock.dto;

import com.hakim.gestiondestock.model.Article;
import com.hakim.gestiondestock.model.TypeMvStk;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.time.Instant;

public class MvStkDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;


    private  ArticleDto article;

    private TypeMvStk TypeMvt;
}
