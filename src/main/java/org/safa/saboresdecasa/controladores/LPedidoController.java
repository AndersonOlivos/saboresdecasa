package org.safa.saboresdecasa.controladores;

import org.safa.saboresdecasa.DTO.LPedidoDTO;
import org.safa.saboresdecasa.DTO.MesaDTO;
import org.safa.saboresdecasa.modelos.LPedido;
import org.safa.saboresdecasa.modelos.Pedido;
import org.safa.saboresdecasa.servicios.LPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/delete/{id}")
    public void eliminarListaPedidoPorId(@PathVariable Integer id) {
        lPedidoService.eliminarListaPedidoPorId(id);
    }

    @PostMapping("/post")
    public void crearListaPedido(@RequestBody LPedidoDTO dto) {
        lPedidoService.crearListaPedido(dto);
    }

    @PostMapping("/edit/{id}")
    public void editarListaPedido(@PathVariable Integer id, @RequestBody LPedidoDTO dto) {
        lPedidoService.editarListaPedido(id, dto);
    }

}
