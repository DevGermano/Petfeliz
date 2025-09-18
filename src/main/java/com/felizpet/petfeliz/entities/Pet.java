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
import java.time.LocalDate;
import java.util.List;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String especie;
    private String raca;
    private LocalDate dataNascimento;
    private String historicoVacinas;
    
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente dono;
    
    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL)
    private List<Consulta> consultas;
    
    
    public Pet() {}
    
    public Pet(String nome, String especie, String raca, LocalDate dataNascimento, String historicoVacinas) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.historicoVacinas = historicoVacinas;
    }
    
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
    
    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }
    
    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }
    
    public String getHistoricoVacinas() { return historicoVacinas; }
    public void setHistoricoVacinas(String historicoVacinas) { this.historicoVacinas = historicoVacinas; }
    
    public Cliente getDono() { return dono; }
    public void setDono(Cliente dono) { this.dono = dono; }
    
    public List<Consulta> getConsultas() { return consultas; }
    public void setConsultas(List<Consulta> consultas) { this.consultas = consultas; }
}