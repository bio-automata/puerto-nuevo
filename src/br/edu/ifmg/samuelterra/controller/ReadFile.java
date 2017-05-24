package br.edu.ifmg.samuelterra.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by samuel on 15/05/17.
 */
public class ReadFile {

    public ReadFile() {

    }

    public void readFile(String path) {


        System.out.printf("\nConteúdo do arquivo texto:\n");
        try {
            FileReader arq = new FileReader(path);
            BufferedReader lerArq = new BufferedReader(arq);

            // lê a primeira linha
            String linha = lerArq.readLine();
            // a variável "linha" recebe o valor "null" quando o processo
            // de repetição atingir o final do arquivo texto
            while (linha != null) {
                //ignora as linhas que tem tamanho 0 (linhas vazias)
                if (linha.length() != 0)
                    System.out.println(String.valueOf(linha.charAt(0)));

                linha = lerArq.readLine(); // lê da segunda até a última linha
            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
    }

}
