package org.safa.saboresdecasa.servicios;

import org.safa.saboresdecasa.modelos.Mesa;
import org.safa.saboresdecasa.modelos.Pedido;
import org.safa.saboresdecasa.repositorios.IMesaRepository;
import org.safa.saboresdecasa.repositorios.IPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class MesaService {
    @Autowired
    private IMesaRepository mesaRepository;

    @GetMapping
    public List<Mesa> obtenerMesas(){
        return mesaRepository.findAll();
    }

    @GetMapping
    public Mesa obtenerMesaPorId(Integer id){
        return mesaRepository.findById(id).orElse(null);
    }
}
