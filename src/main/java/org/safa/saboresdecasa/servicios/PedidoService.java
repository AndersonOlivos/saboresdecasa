package org.safa.saboresdecasa.servicios;

import org.safa.saboresdecasa.DTO.LPedidoDTO;
import org.safa.saboresdecasa.DTO.PedidoDTO;
import org.safa.saboresdecasa.modelos.LPedido;
import org.safa.saboresdecasa.modelos.Pedido;
import org.safa.saboresdecasa.repositorios.IClienteRepository;
import org.safa.saboresdecasa.repositorios.ILPedidoRepository;
import org.safa.saboresdecasa.repositorios.IMesaRepository;
import org.safa.saboresdecasa.repositorios.IPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private IPedidoRepository pedidoRepository;
    @Autowired
    private IMesaRepository mesaRepository;
    @Autowired
    private IClienteRepository clienteRepository;
    @Autowired
    private ILPedidoRepository lPedidoRepository;

    public List<Pedido> obtenerPedidos(){
        return pedidoRepository.findAll();
    }

    public Pedido obtenerPedidoPorId(Integer id){
        return pedidoRepository.findById(id).orElse(null);
    }

    public void eliminarPedidoPorId(Integer id){
        pedidoRepository.deleteById(id);
    }

    public void crearPedido(PedidoDTO dto){
        Pedido pedido  = new Pedido();

        pedido.setNumeroComensales(dto.getNumeroComensales());
        pedido.setPrecioTotal(dto.getPrecioTotal());
        pedido.setMesa(mesaRepository.findById(dto.getIdMesa()).orElse(null));
        pedido.setCliente(clienteRepository.findById(dto.getIdCliente()).orElse(null));
        pedido.setEstadoPedido(dto.getEstadoPedido());

        pedidoRepository.save(pedido);
    }

    public void editarPedido(Integer id,PedidoDTO dto){

        Pedido pedido = pedidoRepository.findById(id).orElse(null);

        if(pedido != null){
            pedido.setNumeroComensales(dto.getNumeroComensales());
            pedido.setPrecioTotal(dto.getPrecioTotal());
            pedido.setMesa(mesaRepository.findById(dto.getIdMesa()).orElse(null));
            pedido.setCliente(clienteRepository.findById(dto.getIdCliente()).orElse(null));
            pedido.setEstadoPedido(dto.getEstadoPedido());

            pedidoRepository.save(pedido);
        }
    }
}
