package br.com.aula01;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Aula 01
 * Atividades 01 a 07
 */
public class Main {
    public static final String LINHA_SEPARADORA
            = "------------------------------------------------------------------------------------------";

    public static void main(String[] args) {
        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        System.out.println(LINHA_SEPARADORA);

        // removendo o primeiro elemento da lista
        // listas são indexadas a partir de 0 (e não 1)
        aulas.remove(0);

        System.out.println(aulas);

        System.out.println(LINHA_SEPARADORA);

        // iteração 'enhanced for/foreach' tradicional para imprimir cada aula com quebra de linha
        // (para cada String 'aula' de 'aulas', faça {...})
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        System.out.println(LINHA_SEPARADORA);

        // printar somente a primeira aula
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);

        System.out.println(LINHA_SEPARADORA);

        // iteração 'for' tradicional
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula: " + aulas.get(i));
        }
        System.out.println(LINHA_SEPARADORA);

        // iteração tradicional 'for' lançando IndexOutOfBoundsException
        try {
            for (int i = 0; i <= aulas.size(); i++) {
                System.out.println("aula: " + aulas.get(i));
            }
        } catch (IndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println(LINHA_SEPARADORA);
        }

        // iteração 'foreach' do Java 8
        // é um método que recebe um objeto Consumer (basta usar a sintaxe do lambda)
        aulas.forEach(aula -> {
            System.out.println("Percorrendo:");
            System.out.println("Aula " + aula);
        });
        System.out.println(LINHA_SEPARADORA);

        // ordenando a lista
        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(LINHA_SEPARADORA);
    }
}
