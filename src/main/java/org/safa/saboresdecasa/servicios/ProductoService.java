package org.safa.saboresdecasa.servicios;

import org.safa.saboresdecasa.DTO.MesaDTO;
import org.safa.saboresdecasa.DTO.ProductoDTO;
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

    public List<Producto> obtenerProductos(){
        return productoRepository.findAll();
    }

    public Producto obtenerProductoPorId(Integer id){
        return productoRepository.findById(id).orElse(null);
    }

    public void eliminarProductoPorId(Integer id){
        productoRepository.deleteById(id);
    }

    public void crearProducto(ProductoDTO dto){
        Producto producto  = new Producto();

        producto.setNombre(dto.getNombre());
        producto.setIngredientes(dto.getIngredientes());
        producto.setTipo(dto.getTipo());
        producto.setSubtipo(dto.getSubtipo());
        producto.setPrecio(dto.getPrecio());

        productoRepository.save(producto);
    }

    public void editarProducto(Integer id,ProductoDTO dto){

        Producto producto = productoRepository.findById(id).orElse(null);

        if(producto != null){
            producto.setNombre(dto.getNombre());
            producto.setIngredientes(dto.getIngredientes());
            producto.setTipo(dto.getTipo());
            producto.setSubtipo(dto.getSubtipo());
            producto.setPrecio(dto.getPrecio());

            productoRepository.save(producto);
        }
    }
}
