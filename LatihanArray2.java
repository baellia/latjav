/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author elsya pertemuan 4
 * 
 */
public class LatihanArray2 {
    public static void main(String[] args){
        
        int i, j;
        int [][] Data_jual;
        Data_jual = new int[3][3];
        Scanner input = new Scanner(System.in);
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                System.out.print("Masukkan Data Jual ke ["+i+"]["+j+"] =");
                Data_jual[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("\n\nData Jual yang Diinput ke Elemen Array \n");
        for(i=0; i<3; i++)
        {
        for(j=0; j<3; j++)
        {
        System.out.print("Nilai Data Jual ["+i+"]["+j+"]");
        System.out.println(" = " + Data_jual[i][j]);
        }
        System.out.println();
    }
  }
}
