package com.hakim.gestiondestock.dto;



import com.hakim.gestiondestock.model.LigneCommandeClient;
import com.hakim.gestiondestock.model.LigneVente;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Builder
@Data
public class LigneVenteDto {
    private Integer id;
    private VentesDto vente;
    private BigDecimal quantite;
    public   LigneVenteDto fromEntity(LigneVente ligneVente){
        if(ligneVente == null){
            return null;
        }
        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .quantite(ligneVente.getQuantite())


                .build();
    }



    public   LigneVente toEntity(LigneVenteDto ligneVenteDto) {
        if (ligneVenteDto == null) {
            return null;

        }
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVente.getId());
        ligneVente.setQuantite(ligneVente.getQuantite());


        return ligneVente;
    }

}
