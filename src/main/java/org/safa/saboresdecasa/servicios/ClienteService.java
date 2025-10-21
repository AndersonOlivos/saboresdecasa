package org.safa.saboresdecasa.servicios;

import ch.qos.logback.core.net.server.Client;
import org.safa.saboresdecasa.DTO.ClienteDTO;
import org.safa.saboresdecasa.modelos.Cliente;
import org.safa.saboresdecasa.repositorios.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private IClienteRepository clienteRepository;

    public List<Cliente> obtenerClientes(){
        return clienteRepository.findAll();
    }

    public Cliente obtenerClientePorId(Integer id){
        return clienteRepository.findById(id).orElse(null);
    }

    public void eliminarClientePorId(@PathVariable Integer id) {
        clienteRepository.deleteById(id);
    }

    public void crearCliente(@RequestBody ClienteDTO dto){
        Cliente cliente  = new Cliente();
        cliente.setNombre(dto.getNombre());
        cliente.setApellidos(dto.getApellidos());
        cliente.setTelefono(dto.getTelefono());
        cliente.setCorreo(dto.getCorreo());
        cliente.setContrasena(dto.getContrasena());
        clienteRepository.save(cliente);
    }

    public void editarCliente(@PathVariable Integer id, @RequestBody ClienteDTO dto){

        Cliente cliente = clienteRepository.findById(id).orElse(null);

        if(cliente != null){
            cliente.setNombre(dto.getNombre());
            cliente.setApellidos(dto.getApellidos());
            cliente.setCorreo(dto.getCorreo());
            cliente.setTelefono(dto.getTelefono());
            cliente.setContrasena(dto.getContrasena());

            clienteRepository.save(cliente);
        }
    }
}
