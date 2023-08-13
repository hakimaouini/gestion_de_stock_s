package com.hakim.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Entreprise")
public class Entreprise extends AbstractEntity{
    @Column(name = "nom")
    private String nom;
    @Column(name = "descrition")
    private String descrition;
    @Embedded
    private Adresse adrsse;
    //private adress
    @Column(name = "photo")
    private String photo;
    @Column(name = "email")
    private String email;
    @Column(name = "numTel")
    private String numTel;
    @Column(name = "siteweb")
    private String steWeb;

    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;
}
