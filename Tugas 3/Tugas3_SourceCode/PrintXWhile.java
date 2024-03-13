/*Nama : Nur Bakti Widjaya
Nim : 13020220134
Tanggal : Rabu,13-3-2024
 */

import java.util.Scanner;
/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan WHILE */
public class PrintXWhile {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus : */
int Sum;
int x;
Scanner masukan=new Scanner(System.in);
/* Program */
Sum = 0; /* Inisialisasi */
System.out.print ("Masukkan nilai x (int), akhiri dg 999 : "); 
x = masukan.nextInt();/* First Elmt*/
while (x != 999) /* Kondisi berhenti */ {
Sum = Sum + x; /* Proses */
System.out.print("Masukkan nilai x (int), akhiri dg 999 : "); 
x = masukan.nextInt();/* First Elmt*/
}
System.out.println("Hasil penjumlahan = "+ Sum); /* 
Terminasi */
}
}