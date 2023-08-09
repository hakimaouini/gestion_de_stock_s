package com.hakim.gestiondestock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "article")
public class Article extends AbstractEntity{
    @Column(name = "codearticle")
    private String codeArticle;
    @Column(name = "designation")
    private String designation;
    @Column(name = "prixUnitaireHt")
    private BigDecimal prixUnitaireHt;
    @Column(name = "tauxTva")
    private BigDecimal tauxTva;
    @Column(name = "prixUnitairTtc")
    private BigDecimal prixUnitairTtc;
    @Column(name = "photo")
    private String photo;
    @OneToMany(mappedBy = "article")
    private List<MvStk> mvStks;
    @ManyToOne
    @JoinColumn(name = "idcategory")
    private Category category;
}
