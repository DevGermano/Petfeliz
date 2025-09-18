package com.felizpet.petfeliz.controller;

import com.felizpet.petfeliz.entities.Pet;
import com.felizpet.petfeliz.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
public class PetController {
    
    @Autowired
    private PetService petService;
    
    @GetMapping
    public List<Pet> listarTodos() {
        return petService.listarTodos();
    }
    
    @GetMapping("/dono/{donoId}")
    public List<Pet> listarPorDono(@PathVariable Long donoId) {
        return petService.listarPorDono(donoId);
    }
    
    @PostMapping
    public Pet criarPet(@RequestBody Pet pet) {
        return petService.salvar(pet);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Pet> buscarPorId(@PathVariable Long id) {
        return petService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Pet> atualizarPet(@PathVariable Long id, @RequestBody Pet pet) {
        if (!petService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        pet.setId(id);
        return ResponseEntity.ok(petService.salvar(pet));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarPet(@PathVariable Long id) {
        if (!petService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        petService.deletar(id);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/buscar")
    public List<Pet> buscarPorNome(@RequestParam String nome) {
        return petService.buscarPorNome(nome);
    }
}