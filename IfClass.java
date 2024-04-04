/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elsya pertemuan 3
 * 
 */
public class IfClass {
    public double TotalBeli,Potongan;
    
    public void setTotalBeli(double a){
        TotalBeli=a;
    }
    
    public double getPotongan(){
        if(TotalBeli >= 50000){
            Potongan = 0.2 * TotalBeli;
        }
        return Potongan;
    }
    
    public double JumlahBayar(){
        return(TotalBeli-Potongan);
    }
}
