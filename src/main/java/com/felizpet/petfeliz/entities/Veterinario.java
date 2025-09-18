/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.felizpet.petfeliz.entities;

/**
 *
 * @author germa
 */
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Veterinario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String especialidade;
    private String telefone;
    
    @OneToMany(mappedBy = "veterinario")
    private List<Consulta> consultas;
    
    
    public Veterinario() {}
    
    public Veterinario(String nome, String especialidade, String telefone) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.telefone = telefone;
    }
    
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
    
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    
    public List<Consulta> getConsultas() { return consultas; }
    public void setConsultas(List<Consulta> consultas) { this.consultas = consultas; }
}