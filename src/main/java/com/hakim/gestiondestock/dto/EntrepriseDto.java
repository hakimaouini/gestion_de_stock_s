package com.hakim.gestiondestock.dto;

import com.hakim.gestiondestock.model.Adresse;
import com.hakim.gestiondestock.model.CommandeFournisseur;
import com.hakim.gestiondestock.model.Entreprise;
import com.hakim.gestiondestock.model.Utilisateur;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class EntrepriseDto {
    private Integer id;
    private String nom;

    private String descrition;

    private Adresse adrsse;
    //private adress

    private String photo;

    private String email;

    private String numTel;

    private String steWeb;

    private List<Utilisateur> utilisateurs;
    public   EntrepriseDto fromEntity(Entreprise entreprise){
        if(entreprise == null){
            return null;
        }
        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .descrition(entreprise.getDescrition())
                .adrsse(entreprise.getAdrsse())
                .photo(entreprise.getPhoto())
                .email(entreprise.getEmail())
                .numTel(entreprise.getNumTel())
                .steWeb(entreprise.getSteWeb())
                .build();
    }



    public   Entreprise toEntity(EntrepriseDto entrepriseDto){
        if ( entrepriseDto == null){
            return null;

        }
        Entreprise entreprise = new Entreprise();
        entreprise.setId(entreprise.getId());
        entreprise.setNom(entreprise.getNom());
        entreprise.setDescrition(entreprise.getDescrition());
        entreprise.setPhoto(entreprise.getPhoto());
        entreprise.setEmail(entreprise.getEmail());
        entreprise.setNumTel(entreprise.getNumTel());
        entreprise.setSteWeb(entreprise.getSteWeb());

        return entreprise;

    }
}
