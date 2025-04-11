package com.example.crud.repository;

import com.example.crud.model.PersonagemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends JpaRepository<PersonagemModel, Long> {
}
