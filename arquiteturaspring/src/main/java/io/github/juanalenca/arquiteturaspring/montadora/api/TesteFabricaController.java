package io.github.juanalenca.arquiteturaspring.montadora.api;

import io.github.juanalenca.arquiteturaspring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    /*
     * A anotação @Autowired realiza a injeção de dependência do Spring,
     * fornecendo automaticamente uma instância gerenciada da classe Motor.
     */
    @Autowired
    private Motor motor;

    @PostMapping("/ligarCarro")
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new ToyotaCorolla(motor);
        return carro.darignicao(chave);
    }

}
