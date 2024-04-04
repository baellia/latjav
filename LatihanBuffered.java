/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
/**
 *
 * @author elsya pertemuan 3
 * 
 */
public class LatihanBuffered {
    public static void main(String[] args)throws Exception{
    
        // Membuat objek baru
        InputStreamReader keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(keyreader);
        // Deklarasi Variabel
        String kata1, kata2;
        
        System.out.print("Masukkan Kata Pertama : ");
        kata1 = input.readLine();
        System.out.print("Masukkan Kata Kedua : ");
        kata2 = input.readLine();
        System.out.println("\nHasil Input String : " + kata1 + " " + kata2);
        
    }
}
