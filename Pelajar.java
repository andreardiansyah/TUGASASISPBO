/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Pelajar {
private String NIP;
private String Nama;
private double nilaiUjian1;
private double nilaiUjian2;
private double nilaiTugas; 
private String Keterangan;
Pelajar(){
}

public String getNIP(){
return NIP;    
}

public void setNIP(String NIP){
this.NIP = NIP;  
}

public String getNama(){
return Nama;    
}

public void setNama(String Nama){
this.Nama = Nama;    
}

public double getnilaiUjian1(){
return nilaiUjian1;    
}

public void setnilaiUjian1(double nilaiUjian1){
this.nilaiUjian1 = nilaiUjian1;
}

public double getnilaiUjian2(){
return nilaiUjian2;    
}

public void setnilaiUjian2(double nilaiUjian2){
this.nilaiUjian2 = nilaiUjian2;
}

public double getnilaiTugas(){
return nilaiTugas;    
}

public void setnilaiTugas(double nilaiTugas){
this.nilaiTugas = nilaiTugas;
}

public double nilaiAkhir(){
return(0.4*this.getnilaiUjian1())+(0.4*this.getnilaiUjian2())+(0.2*this.getnilaiTugas());    
}

public String KeteranganKelulusan(){
if (this.nilaiAkhir()>=60){
Keterangan = "Lulus";    
}
else{
Keterangan = "GAGAL";    
}
return Keterangan;
}

public Pelajar(String NIP, String Nama, double nilaiUjian1, double nilaiUjian2, double nilaiTugas){
this.NIP=NIP;
this.Nama=Nama;
this.nilaiUjian1=nilaiUjian1;
this.nilaiUjian2=nilaiUjian2;
this.nilaiTugas=nilaiTugas;
this.Keterangan=Keterangan;
}

public void Status(){
    System.out.println("______________________________________________________");
    System.out.println("NIP\t      : " +this.getNIP());
    System.out.println("Nama\t      : " +this.getNama());
    System.out.println("Nilai Ujian 1 :" + this.getnilaiUjian1());
    System.out.println("Nilai Ujian 2 :" + this.getnilaiUjian2());
    System.out.println("Nilai Tugasnya:" + this.getnilaiTugas());
    System.out.println("Nilai Akhirnya:" + this.nilaiAkhir());
    System.out.println("Lulus / Gagal :" + this.KeteranganKelulusan());
    System.out.println("______________________________________________________");
}
}


