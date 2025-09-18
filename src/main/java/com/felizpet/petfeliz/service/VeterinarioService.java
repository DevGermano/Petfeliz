package com.felizpet.petfeliz.service;

import com.felizpet.petfeliz.entities.Veterinario;
import com.felizpet.petfeliz.repository.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinarioService {
    
    @Autowired
    private VeterinarioRepository veterinarioRepository;
    
    public List<Veterinario> listarTodos() {
        return veterinarioRepository.findAll();
    }
    
    public Optional<Veterinario> buscarPorId(Long id) {
        return veterinarioRepository.findById(id);
    }
    
    public Veterinario salvar(Veterinario veterinario) {
        return veterinarioRepository.save(veterinario);
    }
    
    public void deletar(Long id) {
        veterinarioRepository.deleteById(id);
    }
    
    public List<Veterinario> buscarPorNome(String nome) {
        return veterinarioRepository.findByNomeContaining(nome);
    }
    
    public List<Veterinario> buscarPorEspecialidade(String especialidade) {
        return veterinarioRepository.findByEspecialidadeContaining(especialidade);
    }
}