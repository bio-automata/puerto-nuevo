package br.edu.ifmg.samuelterra.model.random;

/**
 * Created by dicus on 28/04/17.
 */
public class Normal extends Random {
    private double mean;
    private double variancy;

    public double generate(){
        int i, n;
        double sum;

        n = 128;
        sum = 0;
        for(i=0;i<n;i++){
            sum = sum+this.percentual();
        }

        return mean+variancy*( ( (sum-(n/2)) / ((Math.sqrt(n/12.0)) ) ) );
    }
}
