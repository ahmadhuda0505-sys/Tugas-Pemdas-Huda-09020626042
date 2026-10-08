/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seluruhprojek;
import java.util.Scanner;
public class Nilaiujian {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Ujian Kamu : ");
        int NilaiUjian = input.nextInt();
        
        if (NilaiUjian >= 80){
            System.out.println("Selamat ");
            System.out.println("Kamu"); 
            System.out.println("    Dinyatakan");
            System.out.println("        Lolos");
        }else {
            System.out.println("Tetap Semangat dan jangan menyerah, Karena kesuksesan bukan dari nilai ujian melainkan karena kerja keras dan konsisten");
        }
    }
}    
        

