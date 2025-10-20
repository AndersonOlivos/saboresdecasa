package org.safa.saboresdecasa.servicios;

import org.safa.saboresdecasa.modelos.Mesa;
import org.safa.saboresdecasa.modelos.Producto;
import org.safa.saboresdecasa.repositorios.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private IProductoRepository productoRepository;

    @GetMapping
    public List<Producto> obtenerProductos(){
        return productoRepository.findAll();
    }

    @GetMapping
    public Producto obtenerProductoPorId(Integer id){
        return productoRepository.findById(id).orElse(null);
    }
}
