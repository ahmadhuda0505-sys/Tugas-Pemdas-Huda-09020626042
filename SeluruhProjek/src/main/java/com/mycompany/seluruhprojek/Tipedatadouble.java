/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seluruhprojek;
import java.util.Scanner;
public class Tipedatadouble {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("IPK : ");
        double ipk = input.nextDouble();
        
        System.out.print("Hafalan Juz : ");
        int juz = input.nextInt();
        
        if (ipk >=3.5 && juz >=5){
            System.out.println("Anda dinyatakan lulus tahap seleksi");
        }else {
            System.out.println("Jangan berkecil hati, masih ada kesempatan lain");
        }
    }
}
