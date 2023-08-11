package com.hakim.gestiondestock.dto;

import com.hakim.gestiondestock.model.Article;
import com.hakim.gestiondestock.model.CommandeFournisseur;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ligneCommandeFournisseurDto {

    private Integer id;

    private ArticleDto article;


}
