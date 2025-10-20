package org.safa.saboresdecasa.controladores;

import org.safa.saboresdecasa.modelos.Mesa;
import org.safa.saboresdecasa.servicios.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mesa")
public class MesaController {

    @Autowired
    private MesaService mesaService;

    @GetMapping
    public List<Mesa> obtenerMesas(){
        return mesaService.obtenerMesas();
    }

    @GetMapping("/{id}")
    public Mesa obtenerMesaPorId(@PathVariable Integer id) {
        return mesaService.obtenerMesaPorId(id);
    }
}
