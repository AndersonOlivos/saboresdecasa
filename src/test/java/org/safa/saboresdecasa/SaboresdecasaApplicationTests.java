package org.safa.saboresdecasa;

import org.junit.jupiter.api.Test;
import org.safa.saboresdecasa.modelos.Producto;
import org.safa.saboresdecasa.repositorios.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SaboresdecasaApplicationTests {

    @Autowired
    private IProductoRepository repositoryProducto;

    @Test
    void consultarTodosProductos() {
        System.out.println(repositoryProducto.findById(1));
    }

}
