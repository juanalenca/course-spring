package io.github.juanalenca.arquiteturaspring.montadora.configuration;

import io.github.juanalenca.arquiteturaspring.montadora.Motor;
import io.github.juanalenca.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado") //Bean é um metodo que retorna um objeto construido
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(175);
        motor.setCilindros(4);
        motor.setModelo("2.0 VVT-iE Flex");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADOR);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(169);
        motor.setCilindros(3);
        motor.setModelo("1.6 VVT-iE Eletric");
        motor.setLitragem(1.6);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(190);
        motor.setCilindros(4);
        motor.setModelo("1.5 VVT-iE Turbo");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }

}
