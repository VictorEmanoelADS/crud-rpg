package com.example.crud.controller;

import com.example.crud.model.PersonagemModel;
import com.example.crud.services.PersonagemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {

    @Autowired
    private PersonagemServices personagemServices;

    @PostMapping
    public PersonagemModel criarPersonagem(@RequestBody PersonagemModel personagem) {
        return personagemServices.salvarPersonagem(personagem);
    }

    @GetMapping
    public List<PersonagemModel> listarTodos() {
        return personagemServices.listarPersonagens();
    }

    @GetMapping("/{id}")
    public PersonagemModel buscarPorId(@PathVariable Long id) {
        return personagemServices.buscarPersonagemPorId(id);
    }

    @PutMapping("/{id}")
    public PersonagemModel atualizarPersonagem(@PathVariable Long id, @RequestBody PersonagemModel personagem) {
        return personagemServices.atualizarPersonagem(id, personagem);
    }

    @DeleteMapping("/{id}")
    public void deletarPersonagem(@PathVariable Long id) {
        personagemServices.deletarPersonagem(id);
    }
}
