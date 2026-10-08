/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumperulangan17september;
import java.util.Scanner;
/**
 *
 * @author ahmad
 */
public class Simulasitabungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = input.nextInt();
        
        int tabungan = 100000;
        int totalTabungan = 0;
        
        System.out.println("\n--- Rincian Tabungan ---");
     
        for (int i = 1; i <= jumlahBulan; i++) {
            System.out.println("Bulan " + i + " = Rp" + tabungan);
            totalTabungan += tabungan; 
            tabungan += 50000;         
        }
        System.out.println("\nTotal tabungan = Rp" + totalTabungan);
        
        int tempTabungan = 100000;
        int tempTotal = 0;
        int bulanTarget = 0;
        
        for (int i = 1; i <= jumlahBulan; i++) {
            tempTotal += tempTabungan;
            
            if (tempTotal >= 1000000) {
                bulanTarget = i;
                break; 
            }
            tempTabungan += 50000;
        }
        if (bulanTarget > 0) {
            System.out.println("Total pertama kali mencapai Rp1.000.000 pada bulan ke-" + bulanTarget);
        } else {
            System.out.println("Dalam " + jumlahBulan + " bulan, total tabungan belum mencapai Rp1.000.000.");
        }
        
        input.close();
    }
}
