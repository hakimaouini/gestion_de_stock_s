package com.hakim.gestiondestock.dto;

import com.hakim.gestiondestock.model.Adresse;
import com.hakim.gestiondestock.model.CommandeFournisseur;
import com.hakim.gestiondestock.model.Entreprise;
import com.hakim.gestiondestock.model.Fournisseur;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Builder
@Data
public class FournisseurDto {
    private Integer id;
    private String nom;

    private String prenom;

    private AdresseDto adrsse;
    //private adress

    private String photo;

    private String email;

    private String numTel;

    private List<CommandeFournisseurDto> commandeFournisseurs;
    public   FournisseurDto fromEntity(Fournisseur fournisseur){
        if(fournisseur == null){
            return null;
        }
        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .adrsse(AdresseDto.fromEntity(fournisseur.getAdrsse()))
                .photo(fournisseur.getPhoto())
                .email(fournisseur.getEmail())
                .numTel(fournisseur.getNumTel())

                .build();
    }



    public   Fournisseur toEntity( FournisseurDto fournisseurDto) {
        if (fournisseurDto == null) {
            return null;

        }
        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(fournisseur.getId());
        fournisseur.setNom(fournisseur.getNom());
        fournisseur.setPhoto(fournisseur.getPhoto());
        fournisseur.setEmail(fournisseur.getEmail());
        fournisseur.setNumTel(fournisseur.getNumTel());


        return fournisseur;
    }
}
