/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seluruhprojek;

import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class Mavenproject2 {

    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

        // Input total harta
        System.out.print("Masukkan total harta: Rp ");
        double harta = input.nextDouble();

        // Input nilai nisab
        System.out.print("Masukkan nilai nisab: Rp ");
        double nisab = input.nextDouble();

        // Mengecek apakah harta sudah mencapai nisab
        if (harta >= nisab) {
            double zakat = harta * 0.025;

            System.out.println("Harta mencapai nisab.");
            System.out.println("Zakat yang harus dibayar: Rp " + zakat);
        } else {
            System.out.println("Harta belum mencapai nisab.");
        }

        input.close();
    }
}
