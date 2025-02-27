/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejerpractico.farmacia_santi.service.impl;

import com.ejerpractico.farmacia_santi.dao.CategoriaDAO;
import com.ejerpractico.farmacia_santi.domain.Categoria;
import com.ejerpractico.farmacia_santi.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDAO categoriaDao;

    @Override
    public List<Categoria> getCategorias() {
        var lista = categoriaDao.findAll();
        return lista;
    }
}
