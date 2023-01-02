package org.desafios;

import java.util.Objects;
import java.util.Scanner;

public class IndustriaDaMulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();

        // TODO: Crie a condição necessária para verificar se o motorista, de acordo com a entrada, foi multado ou não.
        if (Objects.nonNull(velocidadeAtual)){
            String msg = "";
            if (velocidadeAtual>60){
                msg="Foi multado";
            }else {
                msg="Nao foi multado";
            }
            System.out.println(msg);
        }
    }
}
