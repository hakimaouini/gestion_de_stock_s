package com.hakim.gestiondestock.dto;

import com.hakim.gestiondestock.model.CommandeClient;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;

public class LigneCommandeClientDto {

    private Integer id;
    private CommandeClientDto commandeClient;
    private AdresseDto article;
    private  CommandeClientDto commandeClent;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
}
