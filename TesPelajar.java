/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.util.Scanner;
public class TesPelajar {
public static void main(String[]args){    

Scanner input = new Scanner(System.in);
System.out.println("______________________________________________________");
    System.out.println("NIP\t\t  : ");
    String NIP = input.nextLine();
    System.out.println("Nama\t\t : ");
    String Nama = input.nextLine();
    System.out.println("Nilai Ujian 1 :");
    double nilaiUjian1 = input.nextDouble();
    System.out.println("Nilai Ujian 2 :");
    double nilaiUjian2 = input.nextDouble();
    System.out.println("Nilai Tugasnya:");
    double nilaiTugas = input.nextDouble();
    System.out.println("______________________________________________________");

Pelajar P1 = new Pelajar();
P1.setNIP(NIP);
P1.setNama(Nama);
P1.setnilaiUjian1(nilaiUjian1);
P1.setnilaiUjian2(nilaiUjian2);
P1.setnilaiTugas(nilaiTugas);

P1.Status();
}    
}
