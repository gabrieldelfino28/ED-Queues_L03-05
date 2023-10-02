package model;

public class Pessoa {
    public String nome;
    public int idade;
    public float altura;

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public Pessoa() {
        super();
    }

    @Override
    public String toString() {
        return "Pessoa -> {" +
                "nome = '" + nome + '\'' +
                ", idade = " + idade +
                ", altura = " + String.format("%.2f", altura) +
                '}';
    }
}
