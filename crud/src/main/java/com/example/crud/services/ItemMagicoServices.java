package com.example.crud.services;

import com.example.crud.model.ItemMagicoModel;
import com.example.crud.repository.ItemMagicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemMagicoServices {

    @Autowired
    private ItemMagicoRepository repository;

    public ItemMagicoModel salvarItem(ItemMagicoModel item) {
        return repository.save(item);
    }

    public List<ItemMagicoModel> listarItens() {
        return repository.findAll();
    }

    public ItemMagicoModel buscarItemPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public ItemMagicoModel atualizarItem(Long id, ItemMagicoModel novoItem) {
        return repository.findById(id).map(item -> {
            item.setNome(novoItem.getNome());
            item.setTipo(novoItem.getTipo());
            item.setForca(novoItem.getForca());
            item.setDefesa(novoItem.getDefesa());
            item.setPersonagem(novoItem.getPersonagem());
            return repository.save(item);
        }).orElse(null);
    }

    public void deletarItem(Long id) {
        repository.deleteById(id);
    }
}
