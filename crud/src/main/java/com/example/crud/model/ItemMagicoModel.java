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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public PersonagemModel getPersonagem() {
        return personagem;
    }

    public void setPersonagem(PersonagemModel personagem) {
        this.personagem = personagem;
    }
}
