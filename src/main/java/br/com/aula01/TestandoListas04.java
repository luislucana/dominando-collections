package br.com.aula01;

import java.util.ArrayList;

/**
 * Atividade 4: Removendo elementos de uma lista
 * Qual método precisaríamos chamar no código a seguir para remover o segundo item da lista?
 */
public class TestandoListas04 {
    public static void main(String[] args) {
        String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
        String curso2 = "Apache Camel";
        String curso3 = "Certificacao Java SE 8 Programmer I";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        // qual metodo chamar aqui?
        cursos.remove(1);

        System.out.println(cursos);
    }
}
