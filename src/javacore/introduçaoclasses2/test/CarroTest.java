package javacore.introduçaoclasses2.test;

import javacore.introduçaoclasses2.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Audi";
        carro.placa = "QJW1022";
        carro.velocidadeMaxima = 220f;
        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);
    }
}
