/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vina_angelica;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class Main_class {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        File file = new File("./src/output/result.txt");
        PrintStream p = new PrintStream(file);
        operate o = new operate();
        int pil ;
        Scanner pilUser = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("         MENU KALKULATOR        ");
        System.out.println("-------------------------------------");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Sisa Bagi");
        System.out.println("-------------------------------------");
        System.out.print("pilihan kamu : ");
        pil = pilUser.nextInt();
        
        
        switch(pil) {
            case 1:
                System.out.println("KAMU MEMILIH PENJUMLAHAN \n");
                System.out.print("Masukkan angka pertama : ");o.a[1] = Integer.parseInt(sc.nextLine());
                System.out.print("Masukkan angka Kedua   : ");o.a[2] = Integer.parseInt(sc.nextLine());
                System.out.println("\n");
                System.out.println("Hasil Telah direkam kedalam file src/output/result.txt");
                o.penjumlahan(p);
                break;
           case 2:
                System.out.println("KAMU MEMILIH PENGURANGAN \n");
                System.out.print("Masukkan angka pertama : ");o.a[1] = Integer.parseInt(sc.nextLine());
                System.out.print("Masukkan angka Kedua   : ");o.a[2] = Integer.parseInt(sc.nextLine());
                System.out.println("\n");
                System.out.println("Hasil Telah direkam kedalam file src/output/result.txt");
                o.pengurangan(p);
                break;
          case 3:
                System.out.println("KAMU MEMILIH PERKALIAN \n");
                System.out.print("Masukkan angka pertama : ");o.a[1] = Integer.parseInt(sc.nextLine());
                System.out.print("Masukkan angka Kedua   : ");o.a[2] = Integer.parseInt(sc.nextLine());
                System.out.println("\n");
                System.out.println("Hasil Telah direkam kedalam file src/output/result.txt");
                o.perkalian(p);
                break;
          case 4:
                System.out.println("KAMU MEMILIH PEMBAGIAN \n");
                System.out.print("Masukkan angka pertama : ");o.a[1] = Integer.parseInt(sc.nextLine());
                System.out.print("Masukkan angka Kedua   : ");o.a[2] = Integer.parseInt(sc.nextLine());
                System.out.println("\n");
                System.out.println("Hasil Telah direkam kedalam file src/output/result.txt");
                o.pembagian(p);
                break;
           case 5:
                System.out.println("KAMU MEMILIH SISA BAGI \n");
                System.out.print("Masukkan angka pertama : ");o.a[1] = Integer.parseInt(sc.nextLine());
                System.out.print("Masukkan angka Kedua   : ");o.a[2] = Integer.parseInt(sc.nextLine());
                System.out.println("\n");
                System.out.println("Hasil Telah direkam kedalam file src/output/result.txt");
                o.sisaBagi(p);
                break;
          default:
              System.out.println("PILIHAN ANDA TIDAK TERSEDIA !!!");
        }
    }
    
}
