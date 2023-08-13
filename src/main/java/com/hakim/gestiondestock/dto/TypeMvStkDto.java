package com.hakim.gestiondestock.dto;

import com.hakim.gestiondestock.model.MvStk;
import com.hakim.gestiondestock.model.TypeMvStk;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TypeMvStkDto {
    private Integer id;
    public   TypeMvStkDto fromEntity(TypeMvStk typeMvStk){
        if(typeMvStk == null){
            return null;
        }
        return TypeMvStkDto.builder()
                .id(typeMvStk.getId())

                .build();
    }



    public   TypeMvStk toEntity(TypeMvStkDto typeMvStkDto) {
        if (typeMvStkDto == null) {
            return null;

        }
        TypeMvStk typeMvStk =new TypeMvStk();
        typeMvStk.setId(typeMvStk.getId());


        return typeMvStk;
    }

}
