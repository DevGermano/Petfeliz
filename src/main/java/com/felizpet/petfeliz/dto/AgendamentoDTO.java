package com.felizpet.petfeliz.dto;

import java.time.LocalDateTime;

public class AgendamentoDTO {
    private LocalDateTime dataHora;
    private String tipo;
    private Long petId;
    private Long veterinarioId;
    private String observacoes;
    
    public AgendamentoDTO() {}
    
    public AgendamentoDTO(LocalDateTime dataHora, String tipo, Long petId, Long veterinarioId) {
        this.dataHora = dataHora;
        this.tipo = tipo;
        this.petId = petId;
        this.veterinarioId = veterinarioId;
    }
    
    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
    
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    
    public Long getPetId() { return petId; }
    public void setPetId(Long petId) { this.petId = petId; }
    
    public Long getVeterinarioId() { return veterinarioId; }
    public void setVeterinarioId(Long veterinarioId) { this.veterinarioId = veterinarioId; }
    
    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }
}