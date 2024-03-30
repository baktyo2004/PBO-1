/*
Nama             : Nur Bakti Widjaya
Nim              : 13020220134
Kelas            : A4
Soal            : Modul 3, No 7.
Tanggal Pengerjaan : Sabtu, 30 Maret 2024
*/

package hashmapp;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapp {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Membuat objek HashMap untuk menyimpan pasangan nilai dan kunci
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Meminta pengguna memasukkan jumlah pasangan nilai dan kunci yang ingin dimasukkan
        System.out.print("Masukkan jumlah pasangan nilai dan kunci: ");
        int jumlahPasangan = scanner.nextInt();
        
        // Meminta pengguna memasukkan nilai dan kunci
        for (int i = 0; i < jumlahPasangan; i++) {
            System.out.print("Masukkan kunci: ");
            String kunci = scanner.next();
            System.out.print("Masukkan nilai: ");
            int nilai = scanner.nextInt();
            
            // Menyimpan pasangan nilai dan kunci ke dalam HashMap
            hashMap.put(kunci, nilai);
        }
        
        // Menampilkan seluruh pasangan nilai dan kunci yang disimpan di HashMap
        System.out.println("Daftar pasangan nilai dan kunci:");
        for (String kunci : hashMap.keySet()) {
            int nilai = hashMap.get(kunci);
            System.out.println("Kunci: " + kunci + ", Nilai: " + nilai);
        }
        
        // Menutup objek Scanner
        scanner.close();
    }
}
