// Identitas Diri
    // NIM : 09020626042
    // Nama : Ahmad Miftahul Huda
    // Modul Praktikum Bab 4
package com.mycompany.praktikum3september;

import java.util.Scanner;
public class Praktikumbab4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("IPK : ");
        double ipk = input.nextDouble();
        
        System.out.print("Hafalan (juz) : ");
        int hafalan = input.nextInt();
        if (ipk >= 3.25 && hafalan >= 5){
            System.out.println("Memenuhi syarat beasiswa.");
        } else {
            System.out.println("Belum memenuhi syarat beasiswa.");
        }
        input.close();
    }
}