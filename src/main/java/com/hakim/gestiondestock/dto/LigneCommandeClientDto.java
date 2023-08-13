package com.hakim.gestiondestock.dto;

import com.hakim.gestiondestock.model.CommandeClient;
import com.hakim.gestiondestock.model.Entreprise;
import com.hakim.gestiondestock.model.LigneCommandeClient;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Builder
@Data
public class LigneCommandeClientDto {

    private Integer id;
    private CommandeClientDto commandeClient;
    private AdresseDto article;
    private  CommandeClientDto commandeClent;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
    public   LigneCommandeClientDto fromEntity(LigneCommandeClient ligneCommandeClient){
        if(ligneCommandeClient == null){
            return null;
        }
        return LigneCommandeClientDto.builder()
                .id(ligneCommandeClient.getId())

                .quantite(ligneCommandeClient.getQuantite())
                .prixUnitaire(ligneCommandeClient.getPrixUnitaire())

                .build();
    }



    public   LigneCommandeClient toEntity(LigneCommandeClientDto ligneCommandeClientDto) {
        if (ligneCommandeClientDto == null) {
            return null;

        }
        LigneCommandeClient ligneCommandeClient = new LigneCommandeClient();
        ligneCommandeClient.setId(ligneCommandeClient.getId());
        ligneCommandeClient.setQuantite(ligneCommandeClient.getQuantite());
        ligneCommandeClient.setPrixUnitaire(ligneCommandeClient.getPrixUnitaire());


        return ligneCommandeClient;
    }
}
