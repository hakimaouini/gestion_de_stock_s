package com.hakim.gestiondestock.dto;

import com.hakim.gestiondestock.model.Adresse;
import com.hakim.gestiondestock.model.Utilisateur;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;

import java.util.List;

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
}

