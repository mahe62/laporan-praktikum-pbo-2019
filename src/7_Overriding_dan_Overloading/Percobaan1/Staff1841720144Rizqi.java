/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author ASUS
 */
public class Staff1841720144Rizqi extends Karyawan1841720144Rizqi{
    private int mLembur;
    private double mGajiLembur;

    public int getmLemburRizqi() {
        return mLembur;
    }

    public void setmLemburRizqi(int mLembur) {
        this.mLembur = mLembur;
    }

    public double getmGajiLemburRizqi() {
        return mGajiLembur;
    }

    public void setmGajiLemburRizqi(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }
    public double getmGajiRizqi(int lembur,double gajilembur){
        return super.getmGajiRizqi()+lembur*gajilembur;
    }

    @Override
    public double getmGajiRizqi() {
        return super.getmGajiRizqi(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void lihatInfoRizqi(){
        System.out.println("NIP         : "+this.getmNipRizqi());
        System.out.println("Nama        : " +this.getmNamaRizqi());
        System.out.println("Golongan    : " +this.getmGolonganRizqi());
        System.out.println("jml Lembur  : " +this.getmLemburRizqi());
        System.out.printf("Gaji Lembur  : %.0f\n",this.getmGajiLemburRizqi());
        System.out.printf("Gaji        :  %.0f\n",this.getmGajiRizqi());
        
    }
}
