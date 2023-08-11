package com.hakim.gestiondestock.dto;

import com.hakim.gestiondestock.model.Fournisseur;


import java.time.Instant;
import java.util.List;

public class CommandeFournisseurDto {
    private Integer id;
    private String code;

    private Instant dateCommande;

    private Fournisseur fournisseur;

    private List<LigneCommandeClientDto> ligneCommandeFournisseurs;
}
