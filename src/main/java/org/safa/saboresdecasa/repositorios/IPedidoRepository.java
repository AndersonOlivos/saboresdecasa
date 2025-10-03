package org.safa.saboresdecasa.repositorios;

import org.safa.saboresdecasa.modelos.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPedidoRepository extends JpaRepository<Pedido, Integer> {

}
