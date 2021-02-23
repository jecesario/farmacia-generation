package com.jecesario.farmaciageneration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jecesario.farmaciageneration.models.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

}
