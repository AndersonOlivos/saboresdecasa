package org.safa.saboresdecasa.controladores;

import org.safa.saboresdecasa.modelos.Cliente;
import org.safa.saboresdecasa.servicios.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService  clienteService;

    @GetMapping
    public List<Cliente> obtenerClientes(){
        return clienteService.obtenerClientes();
    }
}
