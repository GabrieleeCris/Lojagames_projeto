package com.generation.lojadegames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generation.lojadegames.model.Produtos;
import org.springframework.data.repository.query.Param;

@Repository
public interface ProdutosRepository extends JpaRepository <Produtos, Long> {
	public List <Produtos> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	public List <Produtos> findAllByPlataformaContainingIgnoreCase(@Param("") String descicao);


}
