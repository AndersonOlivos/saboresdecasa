package org.safa.saboresdecasa.repositorios;

import org.safa.saboresdecasa.modelos.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {

}
