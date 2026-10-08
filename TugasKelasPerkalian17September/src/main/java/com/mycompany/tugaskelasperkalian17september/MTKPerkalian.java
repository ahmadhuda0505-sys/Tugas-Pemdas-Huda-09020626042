/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaskelasperkalian17september;


   import java.util.Scanner;
import java.lang.Math;

public class MTKPerkalian {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int angka, i;

        i = 1;
        System.out.print("masukkan angka: ");
        angka = input.nextInt();
        while (i <= 10) {
            System.out.println(Integer.toString(angka) + "x" + i + "=" + i * angka);
            i = i + 1;
        }
    }
}

