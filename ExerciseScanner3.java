/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjava;

import java.util.Scanner;
/**
 *
 * @author elsya
 */
public class ExerciseScanner3 {
    public static void main(String args[]){
        ExerciseScanner2 scan = new ExerciseScanner2();
     
        scan.inputScanner();
        System.out.println("\n\nPROGRAM NILAI MAHASISWA");
        System.out.println("-------------------------");
        System.out.println("NIM            : "+scan.nim());
        System.out.println("Nama Mahasiswa : "+scan.getnama());
        System.out.println("Nilai Absen    : "+scan.getabsen());
        System.out.println("Nilai Tugas    : "+scan.gettugas());
        System.out.println("Nilai UTS      : "+scan.getuts());
        System.out.println("Nilai UAS      : "+scan.getuas());
        System.out.println("-------------------------");
        System.out.println("Rata - Rata    : "+scan.rata());
    }
}
