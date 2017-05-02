package br.edu.ifmg.samuelterra;

import br.edu.ifmg.samuelterra.model.Carreta;
import br.edu.ifmg.samuelterra.model.Grua;
import br.edu.ifmg.samuelterra.model.navios.ContainerShip;

import java.util.Queue;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        /*ContainerShip containerShip = new ContainerShipFactory().cria(2);
        System.out.println(containerShip.getNome());

        ContainerShip containerShip2 = new ContainerShipFactory().cria(6);
        System.out.println(containerShip2.getNome());*/

        Queue<ContainerShip> naviosChegada;
        Queue<ContainerShip> naviosAguardandoDescarregar;
        Queue<ContainerShip> naviosSaida;
        Queue<Carreta> filaCarretaPorGrua;
        Queue<Carreta> filaCarretaAguardandoDescarregarContainerPatio;

        Set<Grua> setGruas;
        Set<Grua> setEquipes;
        Set<Grua> setCais;
        Set<Grua> setCarretas;

    }
}