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
public class Manager1841720144Rizqi extends Karyawan1841720144Rizqi {

    private double mTunjangan;
    private String mBagian;
    private Staff1841720144Rizqi st[];

    public double getmTunjanganRizqi() {
        return mTunjangan;
    }

    public void setmTunjanganRizqi(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public String getmBagianRizqi() {
        return mBagian;
    }

    public void setmBagianRizqi(String mBagian) {
        this.mBagian = mBagian;
    }

    public void setStRizqi(Staff1841720144Rizqi[] st) {
        this.st = st;
    }

    public void viewStaffRizqi() {
        int i;
        System.out.println("=====================");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfoRizqi();
        }
        System.out.println("=====================");
        
    }
        public void lihatInfoRizqi(){
        System.out.println("Manager     : "+this.getmBagianRizqi());
        System.out.println("NIP         : "+this.getmNipRizqi());
        System.out.println("Nama        : "+this.getmNamaRizqi() );
        System.out.println("Golongan    : "+this.getmGolonganRizqi() );
        System.out.printf("Tunjangan    : %.0f\n",this.getmTunjanganRizqi());
        System.out.printf("Gaji         : %.0f\n",this.getmGajiRizqi());
        System.out.println("Bagian      : "+this.getmBagianRizqi());
        this.viewStaffRizqi();

        }
        
        public double getmGajiRizqi(){
            return super.getmGajiRizqi()+mTunjangan;
        }
}
