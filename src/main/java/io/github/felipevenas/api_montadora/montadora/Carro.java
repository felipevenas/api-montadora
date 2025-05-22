package io.github.felipevenas.api_montadora.montadora;

import io.github.felipevenas.api_montadora.montadora.api.CarroStatus;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
public class Carro {

    private String modelo;
    private Color cor;
    private Motor motor;
    private Montadora montadora;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public CarroStatus darInigcao(Chave chave) {
        if (chave.getMontadora() != this.montadora) {
            return new CarroStatus("Chave incompatível.");
        }
        return new CarroStatus("Carro ligado! Rodando com o motor: " + motor);
    }
}
