/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seluruhprojek;

/**
 *
 * @author ahmad
 */
public class gajikotor {
    public static void main(String[] args) {
        int gajiKotor = 3000000;
        double pajak = 10 / 100;
        double potonganPajak =  gajiKotor * pajak;
        double gajiBersih = gajiKotor - potonganPajak;
        
        System.out.println("Gaji bersih karyawan bulan ini:");
        System.out.println(gajiBersih);
    }
}
