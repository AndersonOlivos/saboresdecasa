package org.safa.saboresdecasa.servicios;

import org.safa.saboresdecasa.modelos.LPedido;
import org.safa.saboresdecasa.modelos.Pedido;
import org.safa.saboresdecasa.repositorios.ILPedidoRepository;
import org.safa.saboresdecasa.repositorios.IPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class LPedidoService {
    @Autowired
    private ILPedidoRepository lPedidoRepository;

    @GetMapping
    public List<LPedido> obtenerListaPedidos(){
        return lPedidoRepository.findAll();
    }

    @GetMapping
    public LPedido obtenerListaPedidoPorId(Integer id){
        return lPedidoRepository.findById(id).orElse(null);
    }
}
