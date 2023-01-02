package org.desafios;

import java.util.Objects;
import java.util.Scanner;

public class LojinhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();

        // TODO: Crie a condição necessária para que cada cliente saiba quantos doces vai obter de acordo com a entrada
        if (Objects.nonNull(doce)){
            StringBuilder msg = new StringBuilder("O cliente obteve ");
            msg.append(doce*2);
            msg.append(" doces");
            System.out.println(msg);
        }
    }
}
