package com.felizpet.petfeliz.dto;

public class PetResumoDTO {
    private Long id;
    private String nome;
    private String especie;
    private String raca;
    
    public PetResumoDTO() {}
    
    public PetResumoDTO(Long id, String nome, String especie, String raca) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
    }
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
    
    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }
}