package org.desafios;

import java.util.Objects;
import java.util.Scanner;

public class DownloadDePacotes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download
        StringBuilder progresso = new StringBuilder();
        if (Objects.nonNull(tamanho)) {
            for(int i = 0; i<tamanho; i++){
                progresso.append("/");
            }
            System.out.println(progresso);
        }
    }
}
