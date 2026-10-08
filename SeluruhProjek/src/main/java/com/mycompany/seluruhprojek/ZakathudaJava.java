/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seluruhprojek;

/**
 *
 * @author ahmad
 */


import java.util.*;
import java.lang.Math;

public class ZakathudaJava {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double harta;
        double nisab;
        double zakat;

        System.out.println("Masukkan total harta:");
        harta = input.nextDouble();
        System.out.println("Masukkan nilai nisab:");
        nisab = input.nextDouble();
        if (harta >= nisab) {
            zakat = harta * 0.025;
            System.out.println("Zakat = " + zakat);
        } else {
            System.out.println("Harta belum mencapai nisab.");
        }
    }
}