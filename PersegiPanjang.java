package main;

public class PersegiPanjang extends BangunDatar{
    private double panjang, lebar;
    
    public double getPanjang(){
        return panjang;   
    }
    public void setPanjang (double panjang){
        this.panjang = panjang;
    }
    public double getLebar (){
        return lebar;
    }
    public void setLebar (double lebar){
        this.lebar = lebar;
    }
    @Override
    public double luas(){
        return this.panjang * this.lebar;
        
    }
    public double keliling (){
        return 2 * (this.panjang + this.lebar);
    }
    public double luas (double panjang, double lebar){
        return panjang * lebar;
    }
    public double keliling (double panjang, double lebar){
        return 2 *(panjang + lebar); 
        
    }
}
