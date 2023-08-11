package com.hakim.gestiondestock.model;

import com.hakim.gestiondestock.dto.AdresseDto;
import com.hakim.gestiondestock.dto.CommandeClientDto;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "lignecommandeclient")
public class LigneCommandeClient extends AbstractEntity{
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;


    @ManyToOne
    @JoinColumn(name = "idlclient")
    private CommandeClient commandeClient;
}
