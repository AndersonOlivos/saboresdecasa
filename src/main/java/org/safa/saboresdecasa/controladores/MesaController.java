package org.safa.saboresdecasa.controladores;

import org.safa.saboresdecasa.DTO.ClienteDTO;
import org.safa.saboresdecasa.DTO.MesaDTO;
import org.safa.saboresdecasa.modelos.Mesa;
import org.safa.saboresdecasa.servicios.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/delete/{id}")
    public void eliminarMesaPorId(@PathVariable Integer id) {
        mesaService.eliminarMesaPorId(id);
    }

    @PostMapping("/post")
    public void crearMesa(@RequestBody MesaDTO dto) {
        mesaService.crearMesa(dto);
    }

    @PostMapping("/edit/{id}")
    public void editarMesa(@PathVariable Integer id, @RequestBody MesaDTO dto) {
        mesaService.editarMesa(id, dto);
    }
}
