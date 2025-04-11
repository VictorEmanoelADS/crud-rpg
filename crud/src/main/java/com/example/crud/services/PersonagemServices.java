package com.example.crud.services;

import com.example.crud.model.PersonagemModel;
import com.example.crud.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemServices {

    @Autowired
    private PersonagemRepository repository;

    public PersonagemModel salvarPersonagem(PersonagemModel personagem) {
        return repository.save(personagem);
    }

    public List<PersonagemModel> listarPersonagens() {
        return repository.findAll();
    }

    public PersonagemModel buscarPersonagemPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public PersonagemModel atualizarPersonagem(Long id, PersonagemModel novoPersonagem) {
        return repository.findById(id).map(personagem -> {
            personagem.setNome(novoPersonagem.getNome());
            personagem.setClasse(novoPersonagem.getClasse());
            personagem.setLevel(novoPersonagem.getLevel());
            personagem.setNomeAventureiro(novoPersonagem.getNomeAventureiro());
            personagem.setForcaBase(novoPersonagem.getForcaBase());
            personagem.setDefesaBase(novoPersonagem.getDefesaBase());
            return repository.save(personagem);
        }).orElse(null);
    }

    public void deletarPersonagem(Long id) {
        repository.deleteById(id);
    }
}
