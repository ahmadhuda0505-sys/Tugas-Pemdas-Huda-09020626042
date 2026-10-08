    // Identitas Diri
    // NIM : 09020626042
    // Nama : Ahmad Miftahul Huda
    // Modul Praktikum Bab 1
package com.mycompany.praktikum3september;
import java.util.Scanner;
public class Praktikumbab1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();
        System.out.print("Frekuensi wudhu : ");
        int frekuensiWudhu = input.nextInt();
        System.out.print("Air per wudhu (liter) : ");
        double airPerWudhu = input.nextDouble();
        double totalAir = 
        jumlahMahasiswa * frekuensiWudhu * airPerWudhu;
        System.out.println("\n=== HASIL ===");
        
        System.out.println("Total kebutuhan air = " + totalAir + " liter");
        input.close();
    }
}