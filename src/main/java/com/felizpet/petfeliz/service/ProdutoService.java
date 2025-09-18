package com.felizpet.petfeliz.service;

import com.felizpet.petfeliz.entities.Produto;
import com.felizpet.petfeliz.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;
    
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }
    
    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }
    
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }
    
    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }
    
    public List<Produto> buscarPorNome(String nome) {
        return produtoRepository.findByNomeContaining(nome);
    }
    
    public List<Produto> listarPorTipo(String tipo) {
        return produtoRepository.findByTipo(tipo);
    }
    
    public Optional<Produto> atualizarEstoque(Long id, Integer quantidade) {
        Optional<Produto> produtoOpt = produtoRepository.findById(id);
        if (produtoOpt.isPresent()) {
            Produto produto = produtoOpt.get();
            produto.setQuantidadeEstoque(quantidade);
            return Optional.of(produtoRepository.save(produto));
        }
        return Optional.empty();
    }
    
    public List<Produto> listarComBaixoEstoque(Integer limite) {
        return produtoRepository.findByQuantidadeEstoqueLessThan(limite);
    }
}