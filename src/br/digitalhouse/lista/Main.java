package br.digitalhouse.lista;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set <String> conjunto = new HashSet<>();

        conjunto.add("Erika");
        conjunto.add("Jessica");
        conjunto.add("Camila");
        conjunto.add("Rafa");

        for (String valor: conjunto){
            System.out.println(valor);
        }

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(4, "Fiz 4 gols");
        mapa.put(3, "Fiz 3 gols");
        mapa.put(2, "Fiz 2 gols");
        mapa.put(5, "Fiz 5 gols");
        mapa.put(1, "Fiz 1 gols");

        mapa.remove(4);


        for(Integer chave: mapa.keySet()){
            String valor = mapa.get(chave);
            System.out.println(valor);
        }


        List<String> lista = new ArrayList<>();

        lista.add("Alberto");
        lista.add("Roberto");
        lista.add("Aline");
        lista.add("Clemente");
        lista.add("Ronaldo");

        lista.remove(2);

        for (String valor: lista){
            System.out.println(valor);
        }


    }





}
