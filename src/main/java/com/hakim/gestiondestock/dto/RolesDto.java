package com.hakim.gestiondestock.dto;

import com.hakim.gestiondestock.model.MvStk;
import com.hakim.gestiondestock.model.Roles;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RolesDto {
    private Integer id;
    private String nom;
    public   RolesDto fromEntity(Roles roles){
        if(roles == null){
            return null;
        }
        return RolesDto.builder()
                .id(roles.getId())
                .nom(roles.getNom())


                .build();
    }



    public   Roles toEntity(RolesDto rolesDto) {
        if (rolesDto == null) {
            return null;

        }
        Roles roles = new Roles();
        roles.setId(roles.getId());
        roles.setNom(roles.getNom());


        return roles;
    }

}
