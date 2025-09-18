package com.felizpet.petfeliz.controller;

import com.felizpet.petfeliz.entities.Consulta;
import com.felizpet.petfeliz.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consultas")
public class ConsultaController {
    
    @Autowired
    private ConsultaService consultaService;
    
    @GetMapping
    public List<Consulta> listarTodos() {
        return consultaService.listarTodos();
    }
    
    @PostMapping
    public Consulta criarConsulta(@RequestBody Consulta consulta) {
        return consultaService.salvar(consulta);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Consulta> buscarPorId(@PathVariable Long id) {
        return consultaService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Consulta> atualizarConsulta(@PathVariable Long id, @RequestBody Consulta consulta) {
        if (!consultaService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        consulta.setId(id);
        return ResponseEntity.ok(consultaService.salvar(consulta));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarConsulta(@PathVariable Long id) {
        if (!consultaService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        consultaService.deletar(id);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/pet/{petId}")
    public List<Consulta> listarPorPet(@PathVariable Long petId) {
        return consultaService.listarPorPet(petId);
    }
}