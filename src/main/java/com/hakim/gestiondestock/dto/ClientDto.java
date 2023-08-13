package com.hakim.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hakim.gestiondestock.model.Adresse;
import com.hakim.gestiondestock.model.Article;
import com.hakim.gestiondestock.model.Client;
import lombok.Builder;
import lombok.Data;


import java.util.List;

@Builder
@Data
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


    public   ClientDto fromEntity(Client client){
        if(client == null){
            return null;
        }
        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .adrsse(client.getAdrsse())
                .photo(client.getPhoto())
                .email(client.getEmail())
                .numTel(client.getNumTel())
                .build();
    }
    public   Client toEntity(ClientDto clientDto){
        if ( clientDto == null){
            return null;

        }
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setAdrsse(clientDto.getAdrsse());
        client.setPhoto(clientDto.getPhoto());
        client.setNumTel(clientDto.getNumTel());

        return client;

    }
}
