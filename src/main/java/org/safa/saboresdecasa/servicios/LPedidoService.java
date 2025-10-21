package org.safa.saboresdecasa.servicios;

import org.safa.saboresdecasa.DTO.LPedidoDTO;
import org.safa.saboresdecasa.DTO.MesaDTO;
import org.safa.saboresdecasa.modelos.LPedido;
import org.safa.saboresdecasa.modelos.Mesa;
import org.safa.saboresdecasa.modelos.Pedido;
import org.safa.saboresdecasa.repositorios.ILPedidoRepository;
import org.safa.saboresdecasa.repositorios.IPedidoRepository;
import org.safa.saboresdecasa.repositorios.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class LPedidoService {
    @Autowired
    private ILPedidoRepository lPedidoRepository;
    @Autowired
    private IPedidoRepository pedidoRepository;
    @Autowired
    private IProductoRepository productoRepository;

    @GetMapping
    public List<LPedido> obtenerListaPedidos(){
        return lPedidoRepository.findAll();
    }

    @GetMapping
    public LPedido obtenerListaPedidoPorId(Integer id){
        return lPedidoRepository.findById(id).orElse(null);
    }

    public void eliminarListaPedidoPorId(Integer id){
        lPedidoRepository.deleteById(id);
    }

    public void crearListaPedido(LPedidoDTO dto){
        LPedido lpedido  = new LPedido();

        lpedido.setCantidad(dto.getCantidad());
        lpedido.setPedido(pedidoRepository.findById(dto.getIdPedido()).orElse(null));
        lpedido.setProducto(productoRepository.findById(dto.getIdProducto()).orElse(null));

        lPedidoRepository.save(lpedido);
    }

    public void editarListaPedido(Integer id,LPedidoDTO dto){

        LPedido lpedido = lPedidoRepository.findById(id).orElse(null);

        if(lpedido != null){
            lpedido.setCantidad(dto.getCantidad());
            lpedido.setPedido(pedidoRepository.findById(dto.getIdPedido()).orElse(null));
            lpedido.setProducto(productoRepository.findById(dto.getIdProducto()).orElse(null));

            lPedidoRepository.save(lpedido);
        }
    }
}
