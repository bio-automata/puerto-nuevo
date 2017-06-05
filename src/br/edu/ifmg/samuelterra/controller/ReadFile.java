package br.edu.ifmg.samuelterra.controller;

import br.edu.ifmg.samuelterra.model.system.Systema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by samuel on 15/05/17.
 */
public class ReadFile {

    Systema system;

    public ReadFile() {
        system = new Systema();
    }

    public void readFile(String path) {
        System.out.printf("\nConteúdo do arquivo texto:\n");
        try {
            FileReader arq = new FileReader(path);
            BufferedReader lerArq = new BufferedReader(arq);
            String entidade;

            // lê a primeira linha
            String linha = lerArq.readLine();
            // a variável "linha" recebe o valor "null" quando o processo
            // de repetição atingir o final do arquivo texto
            while (linha != null) {
                //ignora as linhas que tem tamanho 0 (linhas vazias)
                if ((linha.length() != 0)&&(!linha.contains("#"))) {
                    //System.out.println(linha);
                    //System.out.println(String.valueOf(linha.charAt(0)));
                    entidade = String.valueOf(linha.charAt(0));

                    switch (entidade){
                        case "U":{
                            //System.out.println("");
                            // U TSM 2592000
                            String resultSplit [] = linha.split(" ");
                            System.out.println(resultSplit[1]);
                            break;
                        }
                        case "G":{
                            //System.out.println("");
                            break;
                        }
                        case "N":{
                            // Tempo de chegada de navios (EXPONENCIAL), em minutos
                            // Exemplo: N CHG 0.003333
                            String splitNavio [] = linha.split(" ");
                            //tempoChegadaNavios = splitNavio[2];
                            break;
                        }
                        case "E":{
                            //System.out.println("");
                            break;
                        }
                        case "Q":{
                            //System.out.println("");
                            break;
                        }
                        case "C":{
                            //System.out.println("");
                            break;
                        }
                        case "R":{
                            //System.out.println("");
                            break;
                        }
                        case "S":{
                            //System.out.println("");
                            break;
                        }
                        case "F":{
                            //System.out.println("");
                            break;
                        }
                        case "T":{
                            //System.out.println("");
                            break;
                        }
                        default:{
                            //System.out.println("Entidade não identificada.");
                            break;
                        }
                    }
                }
                // le a proxima linha
                linha = lerArq.readLine();
            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
    }

}
