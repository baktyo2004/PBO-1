/*
Nama             : Nur Bakti Widjaya
Nim              : 13020220134
Kelas            : A4
Soal            : Modul 3, No 3.
Tanggal Pengerjaan : Sabtu, 30 Maret 2024
*/

package pertemuan2.modul3;

import java.util.*;
public class HitungRata {
    private double total = 0.0;
    private ArrayList nilaiBaru = new ArrayList();
    Scanner input = new Scanner(System.in);
    public void inputNilai(int nilai[]) {
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = input.nextInt();
            total += nilai[i];
        }
    }
    public double rataNilai(int Ndata) {
        return total / ((double) Ndata);
    }
    public void cetakNilai(int nilai[]) {
        for (int angka : nilai) {
            System.out.print(angka + "\n");
        }
        System.out.println();
    }
    public void inputNilaiBaru(int jumlah) {
        while (jumlah > 0) {
            nilaiBaru.add(input.nextInt());
            jumlah--;
        }
    }
    public void cetakNilaiBaru() {
        ListIterator i = nilaiBaru.listIterator(0);
        while (i.hasNext()) {
            Object data = i.next();
            if (data == null) {
                System.out.println("null");
            } else {
                System.out.println(data.toString());
            }
        }
    }
}