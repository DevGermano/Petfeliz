package com.felizpet.petfeliz.service;

import com.felizpet.petfeliz.dto.ClienteDTO;
import com.felizpet.petfeliz.entities.Cliente;
import com.felizpet.petfeliz.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteDTO converterParaDTO(Cliente cliente) {
        if (cliente == null) {
            return null;
        }
        return new ClienteDTO(
            cliente.getId(),
            cliente.getNome(),
            cliente.getTelefone(),
            cliente.getEmail(),
            cliente.getEndereco()
        );
    }
    
    public List<ClienteDTO> listarTodos() {
        return clienteRepository.findAll().stream()
                .map(this::converterParaDTO)
                .collect(Collectors.toList());
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    public List<Cliente> buscarPorNome(String nome) {
        return clienteRepository.findByNomeContaining(nome);
    }
}