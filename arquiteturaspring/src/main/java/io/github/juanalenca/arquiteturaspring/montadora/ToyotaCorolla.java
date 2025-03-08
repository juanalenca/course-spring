package io.github.juanalenca.arquiteturaspring.montadora;

import java.awt.*;

public class ToyotaCorolla extends Carro{

    public ToyotaCorolla(Motor motor) {
        super(motor);
        setModelo("Corolla");
        setCor(Color.BLACK);
        setMontadora(Montadora.TOYOTA);
    }

}
