package com.felizpet.petfeliz.dto;

public class EstoqueDTO {
    private Long produtoId;
    private Integer quantidade;
    private String operacao;
    
    public EstoqueDTO() {}
    
    public EstoqueDTO(Long produtoId, Integer quantidade, String operacao) {
        this.produtoId = produtoId;
        this.quantidade = quantidade;
        this.operacao = operacao;
    }
    
    public Long getProdutoId() { return produtoId; }
    public void setProdutoId(Long produtoId) { this.produtoId = produtoId; }
    
    public Integer getQuantidade() { return quantidade; }
    public void setQuantitude(Integer quantidade) { this.quantidade = quantidade; }
    
    public String getOperacao() { return operacao; }
    public void setOperacao(String operacao) { this.operacao = operacao; }
}