/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vina_angelica;

import java.io.PrintStream;


public class operate {
 
    int perkalian, penjumlahan, pengurangan, sisaBagi;
    double pembagian;
    int [] a = new int[5];
    
    public void input(PrintStream p) {
        p.println("Angka 1 : "+a[1]);
        p.println("Angka 2 : "+a[2]);        
    }
    
    public void perkalian(PrintStream p) {
        perkalian = a[1]*a[2];
        p.println("Kamu memilih perkalian");
        p.println("Hasil Perkalian dari "+a[1]+"x"+a[2]+" = "+perkalian);
    }
    
    public void penjumlahan(PrintStream p) {
        penjumlahan = a[1]+a[2];
        p.println("Kamu memilih penjumlahan");
        p.println("Hasil penjumlahan dari "+a[1]+"+"+a[2]+" = "+penjumlahan);
    }
    
    public void pengurangan(PrintStream p) {
        pengurangan = a[1]-a[2];
        p.println("Kamu memilih pengurangan");
        p.println("Hasil pengurangan dari "+a[1]+"-"+a[2]+" = "+pengurangan);
    }
    
    public void pembagian(PrintStream p) {
        pembagian = a[1]/a[2];
        p.println("Kamu memilih pembagian");
        p.println("Hasil pembagian dari "+a[1]+":"+a[2]+" = "+pembagian);
    }
    
    public void sisaBagi(PrintStream p) {
        sisaBagi = a[1]%a[2];
        p.println("Kamu memilih Sisa Bagi");
        p.println("Hasil Sisa Bagi dari "+a[1]+"%"+a[2]+" = "+sisaBagi);
    }
    
}
