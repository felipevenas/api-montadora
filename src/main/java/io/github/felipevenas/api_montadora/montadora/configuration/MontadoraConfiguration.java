package io.github.felipevenas.api_montadora.montadora.configuration;

import io.github.felipevenas.api_montadora.montadora.Motor;
import io.github.felipevenas.api_montadora.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    // @Bean -> Sempre que a aplicação subir, essa config irá rodar automaticamente.

    @Bean
    public Motor motor() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setModelo("XPTO-0");
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        return motor;
    }

}
