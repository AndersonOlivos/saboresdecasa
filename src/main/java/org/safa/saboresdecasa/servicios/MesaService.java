package org.safa.saboresdecasa.servicios;

import org.safa.saboresdecasa.DTO.MesaDTO;
import org.safa.saboresdecasa.modelos.Mesa;
import org.safa.saboresdecasa.modelos.Mesa;
import org.safa.saboresdecasa.modelos.Pedido;
import org.safa.saboresdecasa.repositorios.IMesaRepository;
import org.safa.saboresdecasa.repositorios.IPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MesaService {
    @Autowired
    private IMesaRepository mesaRepository;

    public List<Mesa> obtenerMesas(){
        return mesaRepository.findAll();
    }

    public Mesa obtenerMesaPorId(Integer id){
        return mesaRepository.findById(id).orElse(null);
    }
    
    public void eliminarMesaPorId(Integer id){
        mesaRepository.deleteById(id);
    }

    public void crearMesa(MesaDTO dto){
        Mesa mesa  = new Mesa();

        mesa.setNumero(dto.getNumero());
        mesa.setDisponible(Boolean.parseBoolean(dto.getDisponible()));
        mesa.setNumComensalesMax(dto.getNumComensalesMax());

        mesaRepository.save(mesa);
    }

    public void editarMesa(Integer id,MesaDTO dto){

        Mesa mesa = mesaRepository.findById(id).orElse(null);

        if(mesa != null){
            mesa.setNumero(dto.getNumero());
            mesa.setDisponible(Boolean.parseBoolean(dto.getDisponible()));
            mesa.setNumComensalesMax(dto.getNumComensalesMax());

            mesaRepository.save(mesa);
        }
    }
}
