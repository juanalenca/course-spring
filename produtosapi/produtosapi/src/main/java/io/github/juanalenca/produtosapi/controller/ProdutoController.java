package io.github.juanalenca.produtosapi.controller;

import io.github.juanalenca.produtosapi.model.Produto;
import io.github.juanalenca.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController //Determina que esta classse vai receber requisições REST
@RequestMapping("produtos") //Determina a url base deste controller, meste caso: "produtos"
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping //criando um novo recurso no servidor
    public Produto salvar(@RequestBody Produto produto){ //anotação para você conseguir receber objetos json
        System.out.println("Produto: " + produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);
        return produto;
    }

}
