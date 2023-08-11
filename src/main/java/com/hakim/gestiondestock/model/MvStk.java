package com.hakim.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Data

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "mvstk")
public class MvStk extends AbstractEntity{
    @Column(name = "datemvt")
    private Instant dateMvt;
    @Column(name = "Quantite")
    private BigDecimal quantite;

    @ManyToOne
    @JoinColumn(name = "article")
    private  Article article;

}
