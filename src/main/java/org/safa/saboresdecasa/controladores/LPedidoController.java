package org.safa.saboresdecasa.controladores;

import org.safa.saboresdecasa.modelos.LPedido;
import org.safa.saboresdecasa.modelos.Pedido;
import org.safa.saboresdecasa.servicios.LPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lpedido")
public class LPedidoController {

    @Autowired
    private LPedidoService lPedidoService;

    @GetMapping
    public List<LPedido> obtenerListaPedidos(){
        return lPedidoService.obtenerListaPedidos();
    }

    @GetMapping("/{id}")
    public LPedido obtenerListaPedidoPorId(@PathVariable Integer id){
        return lPedidoService.obtenerListaPedidoPorId(id);
    }


}
