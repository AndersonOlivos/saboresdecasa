package org.safa.saboresdecasa.repositorios;

import org.safa.saboresdecasa.modelos.LPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ILPedidoRepository extends JpaRepository<LPedido, Integer> {

}
