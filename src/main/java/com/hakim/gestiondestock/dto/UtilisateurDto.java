package com.hakim.gestiondestock.dto;

import com.hakim.gestiondestock.model.Adresse;
import com.hakim.gestiondestock.model.Client;
import com.hakim.gestiondestock.model.Utilisateur;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Builder
@Data
public class UtilisateurDto {
    private Integer id;
    private String nom;

    private String descrition;

    private AdresseDto adrsse;
    //private adress

    private String photo;

    private String email;

    private String numTel;

    private String steWeb;

    @OneToMany(mappedBy = "entreprise")
    private List<UtilisateurDto> utilisateurs;

    public   UtilisateurDto fromEntity(Utilisateur utilisateur){
        if(utilisateur == null){
            return null;
        }
        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .photo(utilisateur.getPhoto())
                .email(utilisateur.getEmail())
                .numTel(utilisateur.getNumTel())
                .build();
    }
    public   Utilisateur toEntity(UtilisateurDto utilisateurDto){
        if ( utilisateurDto == null){
            return null;

        }
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(utilisateurDto.getId());
        utilisateur.setNom(utilisateurDto.getNom());

        utilisateur.setPhoto(utilisateurDto.getPhoto());
        utilisateur.setNumTel(utilisateurDto.getNumTel());

        return utilisateur;

    }
}

