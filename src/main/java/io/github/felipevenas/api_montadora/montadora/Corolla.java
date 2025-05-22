package io.github.felipevenas.api_montadora.montadora;

import java.awt.*;

public class Corolla extends Carro{

    public Corolla(Motor motor) {
        super(motor);
        setModelo("Corolla");
        setCor(Color.white);
        setMontadora(Montadora.TOYOTA);
    }

}
