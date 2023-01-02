package org.desafios;

import java.util.Objects;
import java.util.Scanner;

public class PontosNaCarteira {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();
        StringBuilder msg = new StringBuilder();

        // TODO: Crie a condição necessária para verificar se os carros estão acima da velocidade
        if(Objects.nonNull(velocidade)){
            if(velocidade>80){
                multas++;
            }
            msg.append(multas);
            msg.append(" multas. ");
        }

        // TODO2: Crie a condição para verificar se os motoristas receberão ou não pontos na carteira de habilitação
        if(Objects.nonNull(multas)){
            if(multas<2){
                msg.append("Nao levou pontos na carteira");
            }else{
                msg.append("Levou pontos na carteira");
            }
        }
        System.out.println(msg);
    }
}
