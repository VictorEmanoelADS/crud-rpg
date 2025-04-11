package com.example.crud.controller;

import com.example.crud.model.ItemMagicoModel;
import com.example.crud.services.ItemMagicoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens-magicos")
public class ItemMagicoController {

    @Autowired
    private ItemMagicoServices itemMagicoServices;

    @PostMapping
    public ItemMagicoModel criarItem(@RequestBody ItemMagicoModel itemMagico) {
        return itemMagicoServices.salvarItem(itemMagico);
    }

    @GetMapping
    public List<ItemMagicoModel> listarTodos() {
        return itemMagicoServices.listarItens();
    }

    @GetMapping("/{id}")
    public ItemMagicoModel buscarPorId(@PathVariable Long id) {
        return itemMagicoServices.buscarItemPorId(id);
    }

    @PutMapping("/{id}")
    public ItemMagicoModel atualizarItem(@PathVariable Long id, @RequestBody ItemMagicoModel itemMagico) {
        return itemMagicoServices.atualizarItem(id, itemMagico);
    }

    @DeleteMapping("/{id}")
    public void deletarItem(@PathVariable Long id) {
        itemMagicoServices.deletarItem(id);
    }
}
