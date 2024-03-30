/*
Nama             : Nur Bakti Widjaya
Nim              : 13020220134
Kelas            : A4
Soal            : Modul 4, No 3.
Tanggal Pengerjaan : Sabtu, 30 Maret 2024
*/

package Evaluasi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane; 
/**
 *
 * @author ASUS TUF GAMING
 */
public class Utama {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Input nama dan stambuk menggunakan Scanner
        System.out.print("Masukkan nama: ");
        String nama = reader.readLine();
        System.out.print("Masukkan stambuk: ");
        String stambuk = reader.readLine();

        // Input tugas1, tugas2, mid, dan uas menggunakan BufferedReader
        System.out.print("Masukkan nilai tugas 1: ");
        int tugas1 = Integer.parseInt(reader.readLine());
        System.out.print("Masukkan nilai tugas 2: ");
        int tugas2 = Integer.parseInt(reader.readLine());
        System.out.print("Masukkan nilai mid: ");
        int mid = Integer.parseInt(reader.readLine());
        System.out.print("Masukkan nilai uas: ");
        int uas = Integer.parseInt(reader.readLine());

        // Hitung nilai rata-rata tugas
        double tugas = HitungNilaiAkhir.nilaiTugas(tugas1, tugas2);

        // Hitung nilai akhir
        double na = HitungNilaiAkhir.nilaiAkhir(tugas, mid, uas);

        // Tampilkan nama dan stambuk menggunakan JOptionPane
        JOptionPane.showMessageDialog(null, "Nama: " + nama + "\nStambuk: " + stambuk);

        // Tampilkan nilai tugas, mid, uas, dan na menggunakan JOptionPane
        JOptionPane.showMessageDialog(null, "Nilai tugas: " + tugas + "\nNilai mid: " + mid + "\nNilai uas: " + uas + "\nNilai akhir: " + na);
    }
}

class HitungNilaiAkhir {
    public static double nilaiTugas(int tugas1, int tugas2) {
        return (tugas1 + tugas2) / 2.0;
    }

    public static double nilaiAkhir(double tugas, int mid, int uas) {
        return (tugas * 0.4) + (mid * 0.3) + (uas * 0.3);
    }
}

