package com.jecesario.farmaciageneration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jecesario.farmaciageneration.models.Categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long> {

}
