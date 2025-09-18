package com.felizpet.petfeliz.service;

import com.felizpet.petfeliz.entities.Consulta;
import com.felizpet.petfeliz.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {
    
    @Autowired
    private ConsultaRepository consultaRepository;
    
    public List<Consulta> listarTodos() {
        return consultaRepository.findAll();
    }
    
    public Optional<Consulta> buscarPorId(Long id) {
        return consultaRepository.findById(id);
    }
    
    public Consulta salvar(Consulta consulta) {
        return consultaRepository.save(consulta);
    }
    
    public void deletar(Long id) {
        consultaRepository.deleteById(id);
    }
    
    public List<Consulta> listarPorPet(Long petId) {
        return consultaRepository.findByPetId(petId);
    }
    
    public List<Consulta> buscarPorPeriodo(java.time.LocalDateTime inicio, java.time.LocalDateTime fim) {
        return consultaRepository.findByDataHoraBetween(inicio, fim);
    }
}