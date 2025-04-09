package com.example.crud.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class PersonagemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String nomeAventureiro;
    private String classe;
    private int level;
    private int forcaBase;
    private int defesaBase;

    @OneToMany(mappedBy = "personagem", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemMagicoModel> itensMagicos;

    // Getters e setters
}
