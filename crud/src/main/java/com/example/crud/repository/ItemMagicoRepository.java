package com.example.crud.repository;

import com.example.crud.model.ItemMagicoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemMagicoRepository extends JpaRepository<ItemMagicoModel, Long> {
}
