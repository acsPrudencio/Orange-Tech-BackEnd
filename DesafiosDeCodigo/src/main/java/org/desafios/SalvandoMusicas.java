package org.desafios;
import java.util.Scanner;

public class SalvandoMusicas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();

        // TODO: Crie a condição necessária para verificar o formato do arquivo de entrada
        String formatoArquivo = arquivoDoPc.substring(arquivoDoPc.length()-4, arquivoDoPc.length());

        if(formatoArquivo.equalsIgnoreCase(".mp3")){
            System.out.println("Salvar");
        }else{
            System.out.println("Deletar");
        }
    }
}