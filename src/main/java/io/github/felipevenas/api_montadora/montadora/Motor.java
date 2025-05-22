package io.github.felipevenas.api_montadora.montadora;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Motor {

    private String modelo;
    private Integer cavalos;
    private Integer cilindros;
    private Double litragem;
    private TipoMotor tipoMotor;

    public Motor() {
    }

    public Motor(String modelo, Integer cavalos, Integer cilindros, Double litragem, TipoMotor tipoMotor) {
        this.modelo = modelo;
        this.cavalos = cavalos;
        this.cilindros = cilindros;
        this.litragem = litragem;
        this.tipoMotor = tipoMotor;
    }

}
