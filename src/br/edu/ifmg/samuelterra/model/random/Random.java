package br.edu.ifmg.samuelterra.model.random;

/**
 * Created by dicus on 28/04/17.
 */
public class Random {
    private long A = 69069;
    private int C = 1;
    private long M = (long)Math.pow(2, 32);
    private double currentValue;

    public void setSeed(double seed){
        this.currentValue = seed;
    }

    public long uniform(){
        this.currentValue = ((long)A*this.currentValue+C)%M;
        return (long)this.currentValue;
    }

    public long uniform(long n){
        //this.currentValue = (long)(A*this.currentValue+C)%M;
        return this.uniform()%n;
    }

    public long uniform(long i, long n){
        //this.currentValue = (long)(A*this.currentValue+C)%M;
        return i+this.uniform()%(n-i);
    }

    public double percentual(){
        //this.currentValue = (C*this.currentValue+A)%M;
        return (double)this.uniform()/M;
    }
}
