/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felizpet.petfeliz.repository;

import com.felizpet.petfeliz.entities.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {
    List<Veterinario> findByNomeContaining(String nome);

    public List<Veterinario> findByEspecialidadeContaining(String especialidade);
}
