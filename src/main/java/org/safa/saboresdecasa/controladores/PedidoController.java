package org.safa.saboresdecasa.controladores;

import org.safa.saboresdecasa.DTO.ClienteDTO;
import org.safa.saboresdecasa.DTO.PedidoDTO;
import org.safa.saboresdecasa.modelos.Pedido;
import org.safa.saboresdecasa.servicios.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> obtenerPedidos(){
        return pedidoService.obtenerPedidos();
    }

    @GetMapping("/{id}")
    public Pedido obtenerPedidoPorId(@PathVariable Integer id){
        return pedidoService.obtenerPedidoPorId(id);
    }

    @DeleteMapping("/delete/{id}")
    public void eliminarPedidoPorId(@PathVariable Integer id) {
        pedidoService.eliminarPedidoPorId(id);
    }

    @PostMapping("/post")
    public void crearPedido(@RequestBody PedidoDTO dto) {
        pedidoService.crearPedido(dto);
    }

    @PostMapping("/edit/{id}")
    public void editarPedido(@PathVariable Integer id, @RequestBody PedidoDTO dto) {
        pedidoService.editarPedido(id, dto);
    }

}
