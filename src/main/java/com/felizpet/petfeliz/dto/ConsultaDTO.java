package com.felizpet.petfeliz.dto;

import java.time.LocalDateTime;

public class ConsultaDTO {
    private Long id;
    private LocalDateTime dataHora;
    private String tipo;
    private String diagnostico;
    private String tratamento;
    private String medicamentos;
    private Double valor;
    private Long petId;
    private String petNome;
    private Long veterinarioId;
    private String veterinarioNome;
    
    public ConsultaDTO() {}
    
    public ConsultaDTO(Long id, LocalDateTime dataHora, String tipo, Double valor, 
                      Long petId, String petNome, Long veterinarioId, String veterinarioNome) {
        this.id = id;
        this.dataHora = dataHora;
        this.tipo = tipo;
        this.valor = valor;
        this.petId = petId;
        this.petNome = petNome;
        this.veterinarioId = veterinarioId;
        this.veterinarioNome = veterinarioNome;
    }
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
    
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    
    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }
    
    public String getTratamento() { return tratamento; }
    public void setTratamento(String tratamento) { this.tratamento = tratamento; }
    
    public String getMedicamentos() { return medicamentos; }
    public void setMedicamentos(String medicamentos) { this.medicamentos = medicamentos; }
    
    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }
    
    public Long getPetId() { return petId; }
    public void setPetId(Long petId) { this.petId = petId; }
    
    public String getPetNome() { return petNome; }
    public void setPetNome(String petNome) { this.petNome = petNome; }
    
    public Long getVeterinarioId() { return veterinarioId; }
    public void setVeterinarioId(Long veterinarioId) { this.veterinarioId = veterinarioId; }
    
    public String getVeterinarioNome() { return veterinarioNome; }
    public void setVeterinarioNome(String veterinarioNome) { this.veterinarioNome = veterinarioNome; }
}