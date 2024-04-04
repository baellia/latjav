/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author elsya pertemuan 3
 * 
 */
public class LatihanIf {
    public static void main(String[] args){
        
        double total_beli, potongan=0, jumlah_bayar=0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Total Pembelian Rp. ");
        total_beli= input.nextDouble();
        if(total_beli >= 50000)
            potongan = 0.2 * total_beli;
        System.out.println("Besarnya potongan Rp. " + potongan);
        jumlah_bayar = total_beli - potongan;
        System.out.println("Jumlah yang Harus Dibayar Rp. " + jumlah_bayar);
        
    }
}
