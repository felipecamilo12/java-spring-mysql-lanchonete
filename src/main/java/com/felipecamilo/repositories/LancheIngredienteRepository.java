package com.felipecamilo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipecamilo.entities.LancheIngrediente;
import com.felipecamilo.entities.LancheIngredienteChaveComposta;

@Repository
public interface LancheIngredienteRepository extends JpaRepository<LancheIngrediente, LancheIngredienteChaveComposta>{

}
