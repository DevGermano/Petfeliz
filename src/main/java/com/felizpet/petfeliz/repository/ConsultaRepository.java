/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felizpet.petfeliz.repository;

import com.felizpet.petfeliz.entities.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    List<Consulta> findByDataHoraBetween(LocalDateTime inicio, LocalDateTime fim);
    List<Consulta> findByPetId(Long petId);
}
