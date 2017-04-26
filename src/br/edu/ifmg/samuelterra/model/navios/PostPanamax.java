package br.edu.ifmg.samuelterra.model.navios;

/**
 * Created by samuel on 13/03/17.
 */
public class PostPanamax extends ContainerShip {

    public PostPanamax() {
        setNome("Post Panamax");
        setDescricao("");
        setCapacidadeMinima(5.101);
        setCapacidadeMaxima(10000.0);
        setComprimento(366.0);
        setLargura(49.0);
        setCalado(15.2);
    }
}
