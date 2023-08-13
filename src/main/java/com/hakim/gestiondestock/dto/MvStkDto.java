package com.hakim.gestiondestock.dto;

import com.hakim.gestiondestock.model.Article;
import com.hakim.gestiondestock.model.LigneVente;
import com.hakim.gestiondestock.model.MvStk;
import com.hakim.gestiondestock.model.TypeMvStk;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
@Builder
@Data
public class MvStkDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;


    private  ArticleDto article;

    private TypeMvStk TypeMvt;
    public   MvStkDto fromEntity(MvStk mvStk){
        if(mvStk == null){
            return null;
        }
        return MvStkDto.builder()
                .id(mvStk.getId())
                .dateMvt(mvStk.getDateMvt())
                .quantite(mvStk.getQuantite())



                .build();
    }



    public   MvStk toEntity(MvStkDto mvStkDto) {
        if (mvStkDto == null) {
            return null;

        }
        MvStk mvStk = new MvStk();
        mvStk.setId(mvStk.getId());
        mvStk.setQuantite(mvStk.getQuantite());


        return mvStk;
    }

}
