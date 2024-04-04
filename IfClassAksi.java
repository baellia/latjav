/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author elsya pertemuan 3
 * 
 */
public class IfClassAksi {
    public static void main(String[] args){
        
        double total_beli;
        Scanner input =new Scanner(System.in);
        IfClass fungsiif = new IfClass();
        
        System.out.print("Total Pembelian Rp. ");
        fungsiif.TotalBeli = input.nextDouble();
        
        System.out.println("Besarnya Potongan Rp. " + fungsiif.getPotongan());
        System.out.println("Jumlah yang Harus Dibayarkan Rp. " + fungsiif.JumlahBayar());
    }
}
