package com.felizpet.petfeliz.dto;

import java.time.LocalDate;

public class PetDTO {
    private Long id;
    private String nome;
    private String especie;
    private String raca;
    private LocalDate dataNascimento;
    private String historicoVacinas;
    private Long donoId;
    private String donoNome;
    
    public PetDTO() {}
    
    public PetDTO(Long id, String nome, String especie, String raca, 
                 LocalDate dataNascimento, String historicoVacinas, 
                 Long donoId, String donoNome) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.historicoVacinas = historicoVacinas;
        this.donoId = donoId;
        this.donoNome = donoNome;
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
    
    public Long getDonoId() { return donoId; }
    public void setDonoId(Long donoId) { this.donoId = donoId; }
    
    public String getDonoNome() { return donoNome; }
    public void setDonoNome(String donoNome) { this.donoNome = donoNome; }
}