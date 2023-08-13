package com.hakim.gestiondestock.dto;

import com.hakim.gestiondestock.model.MvStk;
import com.hakim.gestiondestock.model.Ventes;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class VentesDto  {
    private Integer id;
    private String code;
    public   VentesDto fromEntity(Ventes ventes){
        if(ventes == null){
            return null;
        }
        return VentesDto.builder()
                .id(ventes.getId())
                .code(ventes.getCode())




                .build();
    }



    public   Ventes toEntity(VentesDto ventesDto) {
        if (ventesDto == null) {
            return null;

        }
       Ventes ventes =new Ventes();
        ventes.setId(ventes.getId());
        ventes.setCode(ventes.getCode());


        return ventes;
    }

}
