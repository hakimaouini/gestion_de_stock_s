package com.hakim.gestiondestock.dto;



import java.time.Instant;
import java.util.List;

public class CommandeClientDto {
    private Integer id;
    private String code;

    private Instant dateCommande;

    private ClientDto client;

    private List<LigneCommandeClientDto> lignecommandecliene;
}
