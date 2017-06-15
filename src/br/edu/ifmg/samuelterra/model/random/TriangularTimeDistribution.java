package br.edu.ifmg.samuelterra.model.random;


public class TriangularDistributionGen {

    private Double a;
    private Double b;
    private Double c;
    private Random random;

    public TriangularDistributionGen(Double a, Double b, Double c, Random random) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.random = random;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }


    public Double get() {
        return this.random.triangular(this.a, this.b, this.c);
    }
}
