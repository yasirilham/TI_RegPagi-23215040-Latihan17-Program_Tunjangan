/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_LATIHAN_PERTEMUAN_6;

import java.util.Scanner;

/**
 *
 * @author ACER
 * NAMA : M YASIR ILHAM N
 * KELAS : PBO1
 * NIM : 23215040
 * DESKRIPSI PROGRAM : Program ini berisi Program untuk menampilkan Tunjangan
 */
public class TI_RegPagi_23215040_Latihan17_Program_Tunjangan {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        System.out.println("=======Program Tunjangan=======");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        System.out.print("Status Anda? (Menikah/Belum): ");
        String status = scanner.nextLine();

        double tunjangan = hitungTunjangan(gajiPokok, status);
        double totalGaji = gajiPokok + tunjangan;

        System.out.println("\n========Hasil Perhitungan Gaji Anda========");
        System.out.printf("Gaji Pokok      : Rp. %,.0f%n", gajiPokok);
        System.out.printf("Tunjangan       : Rp. %,.0f%n", tunjangan);
        System.out.printf("Total Gaji      : Rp. %,.0f%n", totalGaji);
        System.out.println("\n(Developed by : Rizki Adam Kurniawan)");
    }

    public static double hitungTunjangan(double gajiPokok, String status) {
        if (status.equalsIgnoreCase("Menikah")) {
            return gajiPokok * 0.35;
        } else {
            return 0;
        }
    }
}
