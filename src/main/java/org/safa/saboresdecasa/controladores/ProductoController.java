package org.safa.saboresdecasa.controladores;

import org.safa.saboresdecasa.DTO.PedidoDTO;
import org.safa.saboresdecasa.DTO.ProductoDTO;
import org.safa.saboresdecasa.modelos.Mesa;
import org.safa.saboresdecasa.modelos.Producto;
import org.safa.saboresdecasa.servicios.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/delete/{id}")
    public void eliminarProductoPorId(@PathVariable Integer id) {
        productoService.eliminarProductoPorId(id);
    }

    @PostMapping("/post")
    public void crearProducto(@RequestBody ProductoDTO dto) {
        productoService.crearProducto(dto);
    }

    @PostMapping("/edit/{id}")
    public void editarProducto(@PathVariable Integer id, @RequestBody ProductoDTO dto) {
        productoService.editarProducto(id, dto);
    }
}
