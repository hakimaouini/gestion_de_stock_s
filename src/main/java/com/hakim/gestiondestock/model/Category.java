package com.hakim.gestiondestock.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hakim.gestiondestock.dto.CategoryDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "category")
public class Category extends AbstractEntity{
    @Column(name = "code")
    private String code;
    @Column(name = "designation")
    private String designation;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Article> article;



}
