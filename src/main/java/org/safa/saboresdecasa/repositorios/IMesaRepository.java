package org.safa.saboresdecasa.repositorios;

import org.safa.saboresdecasa.modelos.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IMesaRepository extends JpaRepository<Mesa, Integer> {

}
