package com.hakim.gestiondestock.dto;

import com.hakim.gestiondestock.model.Article;
import com.hakim.gestiondestock.model.CommandeFournisseur;
import com.hakim.gestiondestock.model.Fournisseur;
import lombok.Builder;
import lombok.Data;


import java.time.Instant;
import java.util.List;
@Data
@Builder
public class CommandeFournisseurDto {
    private Integer id;
    private String code;

    private Instant dateCommande;

    private Fournisseur fournisseur;

    private List<LigneCommandeClientDto> ligneCommandeFournisseurs;
    public   CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur){
        if(commandeFournisseur == null){
            return null;
        }
        return CommandeFournisseurDto.builder()
                .id(commandeFournisseur.getId())
                .code(commandeFournisseur.getCode())
                .dateCommande(commandeFournisseur.getDateCommande())

                .build();
    }
    public   CommandeFournisseur toEntity(CommandeFournisseurDto commandeFournisseurDto){
        if ( commandeFournisseurDto == null){
            return null;

        }
        CommandeFournisseur commandeFournisseur = new CommandeFournisseur();
        commandeFournisseur.setId(commandeFournisseur.getId());
        commandeFournisseur.setCode(commandeFournisseur.getCode());
        commandeFournisseur.setDateCommande(commandeFournisseur.getDateCommande());

        return commandeFournisseur;

    }

}
