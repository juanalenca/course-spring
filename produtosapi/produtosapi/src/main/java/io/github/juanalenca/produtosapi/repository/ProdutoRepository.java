package io.github.juanalenca.produtosapi.repository;

import io.github.juanalenca.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
