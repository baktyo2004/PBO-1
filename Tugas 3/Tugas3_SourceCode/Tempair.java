/*Nama : Nur Bakti Widjaya
Nim : 13020220134
Tanggal : Rabu,13-3-2024
 */

import java.util.Scanner;
/* contoh pemakaian IF tiga kasus : wujud air */
public class Tempair {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus : */
int T;
Scanner masukan=new Scanner(System.in);
/* Program */
System.out.print ("Contoh IF tiga kasus \n"); 
System.out.print ("Temperatur (der. C) = "); 
T=masukan.nextInt();
if (T < 0) {
System.out.print ("Wujud air beku \n"+ T);
}else if ((0 <= T) && (T <= 100)){
System.out.print ("Wujud air cair \n"+ T);
}else if (T > 100){
System.out.print ("Wujud air uap/gas \n"+ T); 
};
}
}