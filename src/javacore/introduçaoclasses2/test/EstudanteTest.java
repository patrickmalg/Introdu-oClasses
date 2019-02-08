package javacore.introduçaoclasses2.test;

import javacore.introduçaoclasses2.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args){
        Estudante joao = new Estudante();
        joao.nome = "Joao";
        joao.matricula = "121127";
        joao.idade = 17;
        System.out.println(joao.nome);
        System.out.println(joao.idade);
        System.out.println(joao.matricula);
    }
}
