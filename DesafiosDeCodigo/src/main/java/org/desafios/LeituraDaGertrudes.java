package org.desafios;
import java.util.Objects;
import java.util.Scanner;

public class LeituraDaGertrudes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;

        // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros
        if (Objects.nonNull(paginas)){
            if (paginas<3){
                System.out.println(1 + " dias");
            }else {
                System.out.println((paginas/paginasLidas) + " dias");
            }
        }
    }
}
