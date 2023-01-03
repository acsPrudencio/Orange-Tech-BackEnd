package org.desafios;
import java.util.Scanner;
import java.util.Objects;

public class ImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];

        // TODO: Crie a condição necessária para remover as barras da String e apresentar de forma mais amigável
        if(Objects.nonNull(frase)){
            array = frase.split("/");
            System.out.println("Imovel: " + array[0] + " R$" + array[1] + " " + array[2]);
        }
    }
}
