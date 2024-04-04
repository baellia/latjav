/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author elsya pertemuan 5
 * 
 */
public class LatihanSoalArray {
    public static void main(String[]args)throws IOException{
        
        Scanner input = new Scanner (System.in);
        
        int i, j;
        double tpen=0;
        String np, tgl;
        int jml = 0;
        String [] kodebarang = new String [10];
        String [] namabarang = new String [10];
        int [] jumbel = new int [10];
        double [] harga = new double [10];
        double [] total_harga = new double [10];
        
        System.out.println("                 PT. PERMATA PRATAMA                 ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Masukan Nama Petugas   : "); np=input.nextLine();
        System.out.print("Tanggal                 : "); tgl=input.nextLine();
        System.out.println(" ");
        System.out.print("Jumlah Data yang akan dimasukkan : "); j=input.nextInt();
        System.out.println("—————————————————-----—-"); 
        
        for(i=1;i<=j;i++){
            System.out.println("           Data Ke- " + i);
            System.out.print("             Kode Barang   : "); kodebarang[i]=input.next();
            System.out.print("             Jumlah         : "); jumbel[i]=input.nextInt();
            System.out.println("—————————————————-----—-");
            
            if(kodebarang[i].equalsIgnoreCase("P001")){
                namabarang[i]="Printer";
                harga[i]=700000;
            }
            else if(kodebarang[i].equalsIgnoreCase("V001")){
                namabarang[i]="VGA Card";
                harga[i]=75000;
            }
            else if(kodebarang[i].equalsIgnoreCase("M001")){
                namabarang[i]="Mother Board";
                harga[i]=950000;
            }
            else{
                namabarang[i]="Tidak Terdaftar";
                harga[i]=0;
            }
        }
        
        System.out.println("                               PT. PERMATA PRATAMA                                   ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Nama Petugas               :" + np); System.out.println("                     Tanggal :" + tgl);
        System.out.println("Jumlah Data Yang Dimasukkan :" + j);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Data Ke-   Kode Barang     Nama Barang   Harga Barang   Jumlah Barang   Total Harga");
        System.out.println("--------------------------------------------------------------------------------------");
        
        for(i=1;i<=j;i++){
            total_harga[i]=harga[i]*jumbel[i];
            System.out.println(i+"           "+kodebarang[i]+"           "+namabarang[i]+"   "+harga[i]+"             "+jumbel[i] +"           "+total_harga[i]);
            tpen=tpen+total_harga[i];
        }
        
        System.out.println("Total Pendapatan pada tanggal" + " " + tgl + " " + "adalah sebesar Rp." + tpen );
    }
}