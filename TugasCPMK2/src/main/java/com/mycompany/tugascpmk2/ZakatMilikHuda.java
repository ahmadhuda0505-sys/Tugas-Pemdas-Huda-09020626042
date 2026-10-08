package com.mycompany.tugascpmk2;
import java.util.Scanner;
public class ZakatMilikHuda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
