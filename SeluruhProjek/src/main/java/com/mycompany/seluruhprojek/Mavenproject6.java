/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seluruhprojek;
import java.util.Scanner;
/**
 *
 * @author ahmad
 */public class Mavenproject6 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total harta: ");
        double harta = input.nextDouble();

        System.out.print("Masukkan nilai nisab: ");
        double nisab = input.nextDouble();

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