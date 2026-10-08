/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seluruhprojek;
import java.util.Scanner;
public class Switchh {

    public static void main(String[] args) {
        System.out.println("Pilih makanan angka berapa");
        Scanner input = new Scanner(System.in);
    int makanan = input.nextInt();
    switch (makanan) { 
    case 1:
        System.out.println("bakso");
        break;
    case 2:
        System.out.println("mie ayam");
        break;
    case 3:
        System.out.println("nasi goreng");
        break;
    case 4:
        System.out.println("roti bakar");
        break;
    case 5:
        System.out.println("martabak");
        break;
    case 6:
        System.out.println("nasi kebuli");
        break;
    case 7:
        System.out.println("indomie");
        break;
    }  
        }
                
    }
