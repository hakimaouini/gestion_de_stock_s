package com.hakim.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity{

    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "email")
    private String email;
    @Column(name = "datedenaissance")
    private String dateDeNaissance;
    @Column(name = "motDePasse")
    private String moteDePasse;
    @Embedded
    private Adresse adrsse;
    //private adress
    @Column(name = "photo")
    private String photo;

    @Column(name = "numTel")
    private String numTel;

//    @ManyToOne
//    @JoinColumn(name = "idutilisateur")
//    private Entreprise entreprise;

    @OneToMany(mappedBy = "utilisateur")
    private List<Roles> roles;

}
