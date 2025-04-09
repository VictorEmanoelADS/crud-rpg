package com.example.crud.model;

import jakarta.persistence.*;

@Entity
public class ItemMagicoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String tipo; // Arma, Armadura, Amuleto
    private int forca;
    private int defesa;

    @ManyToOne
    @JoinColumn(name = "personagem_id")
    private PersonagemModel personagem;

    // Getters e setters
}
