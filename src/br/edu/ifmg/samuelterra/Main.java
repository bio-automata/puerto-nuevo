package br.edu.ifmg.samuelterra;

import br.edu.ifmg.samuelterra.model.navios.ContainerShip;

public class Main {

    public static void main(String[] args) {

        ContainerShip containerShip = new ContainerShipFactory().cria(2);
        System.out.println(containerShip.getNome());

        ContainerShip containerShip2 = new ContainerShipFactory().cria(6);

        System.out.println(containerShip2.getNome());

        // simular chegadas de navios

        // simular chegadas de caminhoes

    }
}
