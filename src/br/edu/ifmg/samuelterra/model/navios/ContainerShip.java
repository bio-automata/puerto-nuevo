package br.edu.ifmg.samuelterra.model.navios;

/**
 * Created by samuel on 13/03/17.
 */
public abstract class ContainerShip {

    private String nome;
    private String descricao;
    private Double capacidadeMinima;
    private Double capacidadeMaxima;
    private Double comprimento;
    private Double largura;
    private Double calado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getCapacidadeMinima() {
        return capacidadeMinima;
    }

    public void setCapacidadeMinima(Double capacidadeMinima) {
        this.capacidadeMinima = capacidadeMinima;
    }

    public Double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(Double capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getCalado() {
        return calado;
    }

    public void setCalado(Double calado) {
        this.calado = calado;
    }
}
