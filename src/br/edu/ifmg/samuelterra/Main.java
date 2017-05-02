package br.edu.ifmg.samuelterra;

import br.edu.ifmg.samuelterra.model.Carreta;
import br.edu.ifmg.samuelterra.model.Grua;
import br.edu.ifmg.samuelterra.model.navios.Navio;

import java.util.Queue;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        /*Navio containerShip = new ContainerShipFactory().cria(2);
        System.out.println(containerShip.getNome());

        Navio containerShip2 = new ContainerShipFactory().cria(6);
        System.out.println(containerShip2.getNome());*/

        Queue<Navio> naviosChegada;
        Queue<Navio> naviosAguardandoDescarregar;
        Queue<Navio> naviosSaida;
        Queue<Carreta> filaCarretaPorGrua;
        Queue<Carreta> filaCarretaAguardandoDescarregarContainerPatio;

        Set<Grua> setGruas;
        Set<Grua> setEquipes;
        Set<Grua> setCais;
        Set<Grua> setCarretas;

    }
}