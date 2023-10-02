package view;

import controller.BoomerangController;
import model.Pessoa;
import model.Queue;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Pessoa[] pessoas = new Pessoa[30];
        Random r = new Random();
        Queue<Pessoa> fila = new Queue<>();
        for (int i = 0; i < 30; i++) {
            pessoas[i] = new Pessoa("Pessoa" + (i + 1), r.nextInt(10, 40), r.nextFloat(1.35F, 2.00F));
            fila.insert(pessoas[i]);
        }
        BoomerangController bc = new BoomerangController();
        try {
            bc.Brinquedo(fila);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
