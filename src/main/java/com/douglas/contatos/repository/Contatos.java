package com.douglas.contatos.repository;

import com.douglas.contatos.model.Contato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Contatos extends JpaRepository<Contato, Long> {
}