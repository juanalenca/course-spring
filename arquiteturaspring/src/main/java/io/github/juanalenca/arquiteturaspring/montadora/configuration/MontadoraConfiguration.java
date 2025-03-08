package io.github.juanalenca.arquiteturaspring.montadora.configuration;

import io.github.juanalenca.arquiteturaspring.montadora.Motor;
import io.github.juanalenca.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean //Bean é um metodo que retorna um objeto construido
    public Motor motor(){
        var motor = new Motor();
        motor.setCavalos(175);
        motor.setCilindros(4);
        motor.setModelo("2.0 VVT-iE Flex");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADOR);
        return motor;
    }

}
