package controller;

import model.Pessoa;
import model.Queue;

public class BoomerangController {
    public BoomerangController() {
        super();
    }

    public void Brinquedo(Queue<Pessoa> fila) throws Exception {
        while (fila != null) {
            Pessoa aux = fila.remove();
            if (aux.altura > 1.60 && aux.idade >= 16) {
                System.out.println(aux + " Passou pelo brinquedo");
            } else {
                StringBuilder message = new StringBuilder();
                if (aux.idade < 16) {
                    message.append("Idade menor que 16 anos");
                }
                if (aux.altura < 1.60) {
                    message.append("Altura menor que 1.60m ");
                }
                if (aux.idade < 16 && aux.altura < 1.60) {
                    message = new StringBuilder();
                    message.append("Idade menor que 16 anos, e altura menor que 1.60m");
                }
                System.out.println(aux + " Não passou pelo brinquedo pelos motivos: " + message);
            }
        }
    }
}
