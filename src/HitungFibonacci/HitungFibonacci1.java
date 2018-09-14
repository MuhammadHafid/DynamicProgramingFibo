package HitungFibonacci;

import java.math.BigInteger;
import java.util.Scanner;

public class HitungFibonacci1 {
private static void tampilJudul(String identitas)  {
    System.out.println("Identitas : "+ identitas);
    
    System.out.println("\nHitung Fibonacci");
    System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
}
    public static void main(String[] args) {
        
    String identitas = "Muhammad Hafid Azis / XRPL2 / 23";
    tampilJudul(identitas);
     int n = tampilInput();
        
        BigInteger hasil = fibo(n);
        
        tampilHasil(n, hasil);
    }
    //Initial Commit
    
    private static int tampilInput() {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Bilangan Ke - : ");
        int n = scanner.nextInt();
        
    
       return n;
    }

    private static BigInteger fibo(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void tampilHasil(int n, BigInteger hasil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
     //Tambah Input
    