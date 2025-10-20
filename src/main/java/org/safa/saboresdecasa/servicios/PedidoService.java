package org.safa.saboresdecasa.servicios;

import org.safa.saboresdecasa.modelos.Pedido;
import org.safa.saboresdecasa.repositorios.IPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private IPedidoRepository pedidoRepository;

    @GetMapping
    public List<Pedido> obtenerPedidos(){
        return pedidoRepository.findAll();
    }

    @GetMapping
    public Pedido obtenerPedidoPorId(Integer id){
        return pedidoRepository.findById(id).orElse(null);
    }
}
