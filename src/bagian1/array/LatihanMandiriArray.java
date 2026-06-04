/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian1.array;

/**
 *
 * @author liye
 */
public class LatihanMandiriArray {
public static void main(String[] args) {
        
        // --- SOAL 1: Mencari Suhu Tertinggi dan Terendah ---
        System.out.println("=== SOAL 1 ===");
        double[] suhuHarian = {31.5, 28.2, 34.0, 27.5, 30.1, 32.8};
        
        // Inisialisasi nilai awal dengan elemen pertama array
        double tertinggi = suhuHarian[0];
        double terendah = suhuHarian[0];
        
        for (int i = 1; i < suhuHarian.length; i++) {
            if (suhuHarian[i] > tertinggi) {
                tertinggi = suhuHarian[i];
            }
            if (suhuHarian[i] < terendah) {
                terendah = suhuHarian[i];
            }
        }
        System.out.println("Suhu Tertinggi: " + tertinggi);
        System.out.println("Suhu Terendah : " + terendah);
        System.out.println();


        // --- SOAL 2: Filter Nama Hari > 5 Huruf ---
        System.out.println("=== SOAL 2 ===");
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        System.out.println("Hari yang memiliki lebih dari 5 huruf:");
        for (int i = 0; i < namaHari.length; i++) {
            if (namaHari[i].length() > 5) {
                System.out.println("- " + namaHari[i]);
            }
        }
        System.out.println();


        // --- SOAL 3: Menghitung Banyak Angka Genap ---
        System.out.println("=== SOAL 3 ===");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;
        
        for (int i = 0; i < angka.length; i++) {
            // Jika angka habis dibagi 2, maka genap
            if (angka[i] % 2 == 0) {
                jumlahGenap++;
            }
        }
        System.out.println("Banyak angka genap: " + jumlahGenap);
    }
}