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

public class Sistemparkirkampus2java {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String jeniskendaraan;
        int lamaparkir, totalbiaya, tarifawal, tariftambahan;

        System.out.println("masukkan jenis kendaraan (motor/mobil): ");
        jeniskendaraan = input.nextLine();
        System.out.println("masukkan lama parkir (jam): ");
        lamaparkir = input.nextInt();
        if (jeniskendaraan.equals("Motor") || jeniskendaraan.equals("motor")) {
            tarifawal = 2000;
            tariftambahan = 1000;
        } else {
            tarifawal = 5000;
            tariftambahan = 2000;
        }
        if (lamaparkir <= 1) {
            totalbiaya = tarifawal;
        } else {
            totalbiaya = tarifawal + lamaparkir - 1 * tariftambahan;
        }
        System.out.println("total biaya parkir: Rp " + totalbiaya);
    }
}
