package com.felizpet.petfeliz.dto;

public class ProdutoDTO {
    private Long id;
    private String nome;
    private String tipo;
    private Integer quantidadeEstoque;
    private Double preco;
    
    public ProdutoDTO() {}
    
    public ProdutoDTO(Long id, String nome, String tipo, Integer quantidadeEstoque, Double preco) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    
    public Integer getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(Integer quantidadeEstoque) { this.quantidadeEstoque = quantidadeEstoque; }
    
    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }
}