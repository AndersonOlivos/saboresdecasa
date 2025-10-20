package org.safa.saboresdecasa.controladores;

import org.safa.saboresdecasa.modelos.Mesa;
import org.safa.saboresdecasa.modelos.Producto;
import org.safa.saboresdecasa.servicios.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> obtenerProductos(){
        return productoService.obtenerProductos();
    }

    @GetMapping("/{id}")
    public Producto obtenerProductosPorId(@PathVariable Integer id) {
        return productoService.obtenerProductoPorId(id);
    }
}
