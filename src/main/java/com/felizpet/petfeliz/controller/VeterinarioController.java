package com.felizpet.petfeliz.controller;

import com.felizpet.petfeliz.entities.Veterinario;
import com.felizpet.petfeliz.service.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veterinarios")
public class VeterinarioController {
    
    @Autowired
    private VeterinarioService veterinarioService;
    
    @GetMapping
    public List<Veterinario> listarTodos() {
        return veterinarioService.listarTodos();
    }
    
    @PostMapping
    public Veterinario criarVeterinario(@RequestBody Veterinario veterinario) {
        return veterinarioService.salvar(veterinario);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Veterinario> buscarPorId(@PathVariable Long id) {
        return veterinarioService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Veterinario> atualizarVeterinario(@PathVariable Long id, @RequestBody Veterinario veterinario) {
        if (!veterinarioService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        veterinario.setId(id);
        return ResponseEntity.ok(veterinarioService.salvar(veterinario));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarVeterinario(@PathVariable Long id) {
        if (!veterinarioService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        veterinarioService.deletar(id);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/buscar")
    public List<Veterinario> buscarPorNome(@RequestParam String nome) {
        return veterinarioService.buscarPorNome(nome);
    }
}