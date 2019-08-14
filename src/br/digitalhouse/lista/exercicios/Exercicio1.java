package br.digitalhouse.lista.exercicios;

import java.util.HashMap;
import java.util.Map;

public class Exercicio1 {

    public static void main(String[] args) {

        Map<Integer, String> numerosLoteria = new HashMap<>();

        numerosLoteria.put(1, "Ovos");
        numerosLoteria.put(2, "Agua");
        numerosLoteria.put(3, "Escopeta");
        numerosLoteria.put(4, "Cavalo");
        numerosLoteria.put(5, "Dentista");

        for (Integer chave : numerosLoteria.keySet()) {
            String valor = numerosLoteria.get(chave);
            System.out.println(valor);
        }

        Map<String, String> apelidoAmigos = new HashMap<>();


        apelidoAmigos.put("João", "Juan, Fissura, Maromba");
        apelidoAmigos.put("Miguel", "Night Watch, Bruce Wayne, Tampinha");
        apelidoAmigos.put("Maria", "Wonder Woman, Mary, Marilene");
        apelidoAmigos.put("Lucas", "Lukinha, Jorge, George");

        for (String nomes : apelidoAmigos.keySet()) {
            String apelidos = apelidoAmigos.get(nomes);
            System.out.println(apelidos);
        }
    }
}






