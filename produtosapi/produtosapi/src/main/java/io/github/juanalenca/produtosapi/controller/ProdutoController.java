package io.github.juanalenca.produtosapi.controller;

import io.github.juanalenca.produtosapi.model.Produto;
import io.github.juanalenca.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
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

    @GetMapping("{id}")
    public Produto obterPorId(@PathVariable("id") String id){
        return produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") String id){
        produtoRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public void atualizar(@PathVariable("id") String id,
                          @RequestBody Produto produto){
        produto.setId(id);
        //save serve tanto para salvar quanto para atualizar, o que muda é se o produto vem com id ou não
        produtoRepository.save(produto);
    }

}
