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

    public double percentual(){
        //this.currentValue = (C*this.currentValue+A)%M;
        return (double)this.uniform()/M;
    }

    public double normal(double mean, double variancy){
        int i, n;
        double sum;

        n = 128;
        sum = 0;
        for(i=0;i<n;i++){
            sum = sum+this.percentual();
        }

        return mean+variancy*( ( (sum-(n/2)) / ((Math.sqrt(n/12.0)) ) ) );
    }

    public double exponencial(double lambda){
        return -(1.0/lambda)*Math.log(1.0-this.percentual());
    }

    public double triangular(double a, double b, double c){
        double x;

        x = this.percentual();
        if(x>=a && x<c){
            return (2*(x-a))/((b-a)*(c-a));
        }
        if(x>c && x<=b){
            return (2*(b-x))/((b-a)*(b-c));
        }
        else{
            return 2/(b-a);
        }
    }

}
