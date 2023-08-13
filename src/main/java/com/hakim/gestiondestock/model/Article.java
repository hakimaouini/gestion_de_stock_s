package com.hakim.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@Getter
@Setter
@Builder
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
    private TypeMvStk TypeMvt;
    @ManyToOne
    @JoinColumn(name = "idcategory")
    private Category category;

}
