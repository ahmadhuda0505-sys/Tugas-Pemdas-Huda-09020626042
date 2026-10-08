/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumperulangan17september;
import java.util.Scanner;
public class tabelperkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("masukkan angka perkalian");
        int angka = input.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int hasil = angka * i;
            System.out.println(angka + "x" + i + "=" + hasil);
        }
    }
}
