package org.safa.saboresdecasa.controladores;

import org.safa.saboresdecasa.DTO.ClienteDTO;
import org.safa.saboresdecasa.modelos.Cliente;
import org.safa.saboresdecasa.modelos.Producto;
import org.safa.saboresdecasa.servicios.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService  clienteService;

    @GetMapping
    public List<Cliente> obtenerClientes(){
        return clienteService.obtenerClientes();
    }

    @GetMapping("/{id}")
    public Cliente obtenerClientePorId(@PathVariable Integer id) {
        return clienteService.obtenerClientePorId(id);
    }

    @DeleteMapping("/delete/{id}")
    public void eliminarClientePorId(@PathVariable Integer id) {
        clienteService.eliminarClientePorId(id);
    }

    @PostMapping("/post")
    public void crearCliente(@RequestBody ClienteDTO dto) {
        clienteService.crearCliente(dto);
    }

    @PostMapping("/edit/{id}")
    public void editarCliente(@PathVariable Integer id, @RequestBody ClienteDTO dto) {
        clienteService.editarCliente(id, dto);
    }
}
