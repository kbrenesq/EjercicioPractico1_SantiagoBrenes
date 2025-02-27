package com.ejerpractico.farmacia_santi.dao;


import com.ejerpractico.farmacia_santi.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDAO extends JpaRepository <Categoria,Long> {
    
}
