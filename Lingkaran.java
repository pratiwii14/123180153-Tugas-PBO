package main;

public class Lingkaran extends BangunDatar{
    private double r;
    double phi = 3.14;
    
    public double getR(){
        return r;
    }
    public void setR(double r){
        this.r = r;
    }
    public double luas (double r){
        return phi*r*r; 
    }
    public double keliling (double r){
        return 2 * phi * r;
    }
}
