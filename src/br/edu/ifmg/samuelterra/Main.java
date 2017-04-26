package br.edu.ifmg.samuelterra;

import br.edu.ifmg.samuelterra.model.navios.ContainerShip;

public class Main {

    public static void main(String[] args) {

        ContainerShip containerShip = new ContainerShipFactory().cria(2);

        System.out.print(containerShip.getNome());

        // simular chegadas de navios
        // simular chegadas de caminhoes

    }
}
