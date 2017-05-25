package br.edu.ifmg.samuelterra;

import br.edu.ifmg.samuelterra.controller.ReadFile;
import br.edu.ifmg.samuelterra.model.entities.ships.Ship;
import br.edu.ifmg.samuelterra.model.entities.vehicles.Cart;
import br.edu.ifmg.samuelterra.model.entities.Crane;
import br.edu.ifmg.samuelterra.model.system.System;

import java.nio.file.Paths;
import java.util.Queue;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        /*Ship containerShip = new ContainerShipFactory().cria(2);
        System.out.println(containerShip.getNome());

        Ship containerShip2 = new ContainerShipFactory().cria(6);
        System.out.println(containerShip2.getNome());*/

        Queue<Ship> naviosChegada;
        Queue<Ship> naviosAguardandoDescarregar;
        Queue<Ship> naviosSaida;
        Queue<Cart> filaCarretaPorGrua;
        Queue<Cart> filaCarretaAguardandoDescarregarContainerPatio;

        Set<Crane> setGruas;
        Set<Crane> setEquipes;
        Set<Crane> setCais;
        Set<Crane> setCarretas;

        ReadFile readFile = new ReadFile();
        readFile.readFile("/home/samuel/IdeaProjects/Puerto Nuevo/src/br/edu/ifmg/samuelterra/cenario.txt");


    }
}