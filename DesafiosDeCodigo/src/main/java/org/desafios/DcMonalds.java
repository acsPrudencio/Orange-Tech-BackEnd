package org.desafios;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Objects;

public class DcMonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];

        // TODO: Crie a condição necessária para formatar e printar o texto da maneira pedida na saída
        if(Objects.nonNull(ingredientes)){
            listaIngredientes = ingredientes.split(";");
            Arrays.stream(listaIngredientes).forEach(ingrediente -> {
                System.out.println(ingrediente);
            });

        }
    }
}
