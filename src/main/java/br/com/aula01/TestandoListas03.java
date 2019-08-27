package br.com.aula01;

import java.util.ArrayList;

/**
 * Atividade 3: Adicionando elementos em um ArrayList
 */
public class TestandoListas03 {
    public static void main(String[] args) {
        String curso1 = "Modelando a classe Aula";
        String curso2 = "Conhecendo mais de listas";
        String curso3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        // imprime os itens da lista
        // [item 0, item 1, item 2]
        System.out.println(cursos);
    }
}
