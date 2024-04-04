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
public class ExerciseScanner2 {
    
    public String nama;
    public double jml;
    public int nim, absen, tugas, uts, uas;
 
    Scanner input = new Scanner (System.in);
    public String getnama(){
        return nama;
    }
     public int nim(){
            return (nim);
        }
   
    public void inputScanner(){
        System.out.print("Masukkan Nama Anda : ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM Anda : ");
        nim = input.nextInt();
        System.out.print("Masukkan Nilai Absen : ");
        absen = input.nextInt();
        System.out.print("Masukkan Nilai Tugas : ");
        tugas = input.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        uts = input.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        uas = input.nextInt();
    }
    public int getabsen(){
            return (absen);
        }
        public int gettugas(){
            return (tugas);
        }
        public int getuts(){
            return (uts);
        }
        public int getuas(){
            return (uas);
        }
        public double rata(){
            return ((10/100*absen)+(20/100*tugas)+(30/100*uts)+(40/100*uas));
        }      
}
