package main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       Persegi persegi = new Persegi();
       PersegiPanjang pp = new PersegiPanjang ();
       Segitiga segitiga = new Segitiga ();
       Lingkaran lingkaran = new Lingkaran ();
       Kubus kubus = new Kubus ();
       Silinder silinder = new Silinder ();
       Balok balok = new Balok ();
       
       //overload
       System.out.println ("1. Persegi");
       System.out.println ("Luas persegi : " + persegi.luas(15));
       System.out.println ("Keliling persegi : " + persegi.keliling(15));
       System.out.println ("2. Persegi Panjang");
       System.out.println ("Luas persegi panjang : " + pp.luas (3,5));
       System.out.println ("Keliling persegi panjang : " + pp.keliling(3,5));
       System.out.println ("3. Segitiga");
       System.out.println ("Luas segitiga : "+ segitiga.luas(4,5));
       System.out.println ("Keliling segitiga : " + segitiga.keliling(4,5));
       System.out.println ("4. Lingkaran");
       System.out.println ("Luas lingkaran : " + lingkaran.luas(8));
       System.out.println ("Keliling lingkaran : " + lingkaran.keliling(8));
       System.out.println ("5. Kubus");
       System.out.println ("Volume kubus : " + kubus.volume(12));
       System.out.println ("6. Silinder");
       System.out.println ("Volume silinder : " + silinder.volume(3,5));
       System.out.println ("7. Balok");
       System.out.println ("Volume balok : " + balok.volume(6,7,8));
       
    }
    
}
