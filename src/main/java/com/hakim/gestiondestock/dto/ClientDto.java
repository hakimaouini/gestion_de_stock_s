package com.hakim.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hakim.gestiondestock.model.Adresse;
import com.hakim.gestiondestock.model.Client;


import java.util.List;


public class ClientDto {
    private Integer id;
    private String nom;

    private String prenom;

    private Adresse adrsse;
    //private adress

    private String photo;

    private String email;

    private String numTel;
    @JsonIgnore

    private List<CommandeClientDto> commandeclient;


    public Client toEntity(ClientDto clientDto)
    {
       return  Client.builder().build();
    }
}
