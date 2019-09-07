/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author ASUS
 */
public class Lingkaran1841720144Rizqi {
   double PHI=3.14,mR;
   
   public double HitungLuasRizqi(){
      double luasLingkaran = (mR*mR)*PHI;
      return luasLingkaran;
   }
   public double HitungKelilingRizqi(){
      double kelilingLingkaran = 2*mR*PHI; 
      return kelilingLingkaran;
   }
   
   public void TampilLingkaranRizqi(){
       System.out.println("Jari Jari :" +mR);
   }
}
