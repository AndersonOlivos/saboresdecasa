package org.safa.saboresdecasa.servicios;

import org.safa.saboresdecasa.modelos.Cliente;
import org.safa.saboresdecasa.repositorios.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private IClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> obtenerClientes(){
        return clienteRepository.findAll();
    }
}
