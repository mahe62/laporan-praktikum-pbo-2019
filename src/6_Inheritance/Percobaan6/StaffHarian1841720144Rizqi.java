/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan6;

/**
 *
 * @author ASUS
 */
public class StaffHarian1841720144Rizqi extends Staff1841720144Rizqi{
    public int mJmlJamKerja;

    public StaffHarian1841720144Rizqi() {
    }

    public StaffHarian1841720144Rizqi(int mJamKerja, int mLembur, int mPotongan, String mNama, String mAlamat, String mJk, int mUmur, int mGaji) {
        super(mLembur, mPotongan, mNama, mAlamat, mJk, mUmur, mGaji);
        this.mJmlJamKerja = mJmlJamKerja;
    }
    public void tampilStaffHarianRizqi(){
        System.out.println("==========Data Staff Harian==========");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Keerja   : "+mJmlJamKerja);
        System.out.println("Gaji Bersih         : "+(mJmlJamKerja*mGaji+mLembur-mPotongan));

    }
}
