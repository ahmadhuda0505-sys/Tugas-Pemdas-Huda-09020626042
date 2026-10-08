/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seluruhprojek;
import java.util.Scanner;
public class Nilaipk {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai kamu: ");
    double nilai = input.nextDouble();
if (nilai >= 91 && nilai <= 100) {
            System.out.println("Nilai kamu: A");
        }else if (nilai >=100){
            System.out.println("Nilai kamu terlalu besar");
        }else if (nilai >= 86){
            System.out.println("Nilai kamu: A-");
        }else if (nilai >= 76){
            System.out.println("Nilai kamu: B+");
        }else if (nilai >= 71){
            System.out.println("Nilai kamu: B-");
        }else if (nilai >= 66){
            System.out.println("Nilai kamu: C+");
        }else if (nilai >= 61){
           System.out.println("Nilai kamu: C");
        }else if (nilai >= 56){
            System.out.println("Nilai kamu: d");
        }else if (nilai >=0){
            System.out.println("Nilai kamu: e");    
        } else
            System.out.println("KAMU GOBLOK");
    }
}    

                
