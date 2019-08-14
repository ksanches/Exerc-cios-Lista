package br.digitalhouse.lista.exercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio2 {

    public static void main(String[] args) {

        System.out.println("*********** Lista com Simples *****************");

        List<Integer> listaVazia = new ArrayList<>();

        listaVazia.add(1);
        listaVazia.add(5);
        listaVazia.add(5);
        listaVazia.add(6);
        listaVazia.add(7);
        listaVazia.add(8);
        listaVazia.add(8);
        listaVazia.add(8);

        for (Integer valor:listaVazia){
            System.out.println(valor);
        }

        System.out.println("*********** Lista com Conjunto *****************");
        Set<Integer> listaVaziaConjunto = new HashSet<>();
        listaVaziaConjunto.add(1);
        listaVaziaConjunto.add(5);
        listaVaziaConjunto.add(5);
        listaVaziaConjunto.add(6);
        listaVaziaConjunto.add(7);
        listaVaziaConjunto.add(8);
        listaVaziaConjunto.add(8);
        listaVaziaConjunto.add(8);

        for (Integer conjunto: listaVaziaConjunto){
            System.out.println(conjunto);
        }


    }
}
