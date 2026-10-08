/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seluruhprojek;

import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        // Input total harta dan nisab
        Scanner input = new Scanner(System.in);
            // Input total harta dan nisab
            System.out.print("Masukkan Total Harta: Rp ");
            double totalHarta = input.nextDouble();
            
            System.out.print("Masukkan Nilai Nisab: Rp ");
            double nilaiNisab = input.nextDouble();
            
            // Pengecekan kondisi nisab dan perhitungan zakat
            if (totalHarta >= nilaiNisab) {
                double zakat = totalHarta * 0.025; // 2.5% = 0.025
                System.out.printf("Wajib membayar zakat sebesar: Rp %,.2f%n", zakat);
            } else {
                System.out.println("Harta belum mencapai nisab.");
            }
        }
    }
