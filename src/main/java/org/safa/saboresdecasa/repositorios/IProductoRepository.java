package org.safa.saboresdecasa.repositorios;

import org.safa.saboresdecasa.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
