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
public class ClassScanner {
    public String nama;
    public double n1;
    public int n2,n3;
    Scanner input = new Scanner(System.in);
    
    public String getnama(){
        return nama;
    }
    
public void inputScanner(){
    
System.out.print("Masukkan Nama Anda : ");
nama = input.nextLine();
System.out.print("Masukkan Nilai 1 : ");
n1 = input.nextInt();
System.out.print("Masukkan Nilai 2 : ");
n2 = input.nextInt();
}

public double rata(){
    return ((n1 + n2)/2);
}
}