package br.com.saldocerto.produtos.repository;

import br.com.saldocerto.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> { }