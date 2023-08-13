package com.hakim.gestiondestock.dto;

import com.hakim.gestiondestock.model.Adresse;
import com.hakim.gestiondestock.model.Article;
import com.hakim.gestiondestock.model.MvStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Builder
@Data
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
    public   ArticleDto fromEntity(Article article){
        if(article == null){
            return null;
        }
        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .prixUnitaireHt(article.getPrixUnitaireHt())
                .tauxTva(article.getTauxTva())
                .prixUnitairTtc(article.getPrixUnitairTtc())
                .photo(article.getPhoto())
                .mvStks(article.getMvStks())
                .build();
    }
    public   Article toEntity(ArticleDto articleDto){
        if ( articleDto == null){
            return null;

        }
        Article article = new Article();
        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(articleDto.getDesignation());
        article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
        article.setTauxTva(articleDto.getTauxTva());
        article.setPrixUnitairTtc(articleDto.getPrixUnitairTtc());
        article.setPhoto(articleDto.getPhoto());
        article.setMvStks(articleDto.getMvStks());
        return article;

    }
}
