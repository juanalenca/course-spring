package io.github.juanalenca.arquiteturaspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExemploValue {

    //Buscando um vlaor dentro do application.yml e o colocando na variavel
    @Value("${app.config.variable}")
    private String var;

    public void imprimirVariable() {
        System.out.println("Valor da variavel: " + var);
    }
}
