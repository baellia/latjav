/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elsya pertemuan 3
 * 
 */
public class IfElseAksi {
    public static void main(String[] args){
        
        // Pembuatan objek baru dari class IfElseClass.java
        IfElseClass ifclass = new IfElseClass();
        
        ifclass.setInputData();
        ifclass.getKeterangan();
        
        System.out.print("Hasil Akhir");
        System.out.print("====================================================================");
        System.out.print("Nama Siswa :                                 " + ifclass.nama);
        System.out.print("Nilai Akhir yang di dapat :                  " + ifclass.nilaiAkhir);
        System.out.print("Keterangan :                  " + ifclass.getKeterangan());
        System.out.print("====================================================================");
        
    }
}
