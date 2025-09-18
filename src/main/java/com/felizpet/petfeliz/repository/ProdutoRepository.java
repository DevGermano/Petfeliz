/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felizpet.petfeliz.repository;

import com.felizpet.petfeliz.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByNomeContaining(String nome);
    List<Produto> findByTipo(String tipo);

    public List<Produto> findByQuantidadeEstoqueLessThan(Integer limite);
}