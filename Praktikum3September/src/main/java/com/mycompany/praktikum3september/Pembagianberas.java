    //identitas diri
    //Nim : 09020626042
    //Nama : Ahmad Miftahul Huda
    //Model Pratikum bab 3
package com.mycompany.praktikum3september;
import java.util.Scanner;
public class Pembagianberas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total beras (kg): ");
        int totalBeras = input.nextInt();
        
        System.out.print("Jumlah keluarga penerima: ");
        int jumlahKeluarga = input.nextInt();
        int berasPerKeluarga = totalBeras / jumlahKeluarga;
        int sisaBeras = totalBeras % jumlahKeluarga;
        System.out.println("\n=== HASIL PEMBAGIAN BERAS ===");
        System.out.println("Beras per keluarga = "
                + berasPerKeluarga + " kg");
        System.out.println("Sisa beras = "
                + sisaBeras + " kg");
        int sisaDalamGram = sisaBeras * 1000;
        int tambahanGram = sisaDalamGram / jumlahKeluarga;
        System.out.println("Tambahan per keluarga = "
                + tambahanGram + " gram");
        input.close();
    }
}