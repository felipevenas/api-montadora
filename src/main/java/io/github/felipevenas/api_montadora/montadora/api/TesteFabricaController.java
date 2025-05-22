package io.github.felipevenas.api_montadora.montadora.api;

import io.github.felipevenas.api_montadora.montadora.Carro;
import io.github.felipevenas.api_montadora.montadora.Chave;
import io.github.felipevenas.api_montadora.montadora.Corolla;
import io.github.felipevenas.api_montadora.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    // @Autowired -> Acessa o container do Spring e injeta a instância na classe.
    @Autowired
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new Corolla(motor);
        return carro.darInigcao(chave);
    }

}
