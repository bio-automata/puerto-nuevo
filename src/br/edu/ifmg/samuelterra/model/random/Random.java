package br.edu.ifmg.samuelterra.model.random;

/**
 * Created by dicus on 28/04/17.
 */
public class Random {
    public static final int UNIFORM = 0;
    public static final int UNIFORMRANGE = 1;
    public static final int PERCENTUAL = 2;
    public static final int NORMAL = 3;
    public static final int EXPONENTIAL = 4;
    public static final int TRIANGULAR = 5;
    public static final int POISSON = 6;

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

    public double exponential(double lambda){
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
