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
public class StaffTetap1841720144Rizqi extends Staff1841720144Rizqi{
    public String mGolongan;
    public int mAsuransi;

    public StaffTetap1841720144Rizqi() {
    }

    public StaffTetap1841720144Rizqi(String mGolongan, int aAsuransi, int mLembur, int mPotongan, String mNama, String mAlamat, String mJk, int mUmur, int mGaji) {
        super(mLembur, mPotongan, mNama, mAlamat, mJk, mUmur, mGaji);
        this.mGolongan = mGolongan;
        this.mAsuransi = mAsuransi;
    }

public void tampilStaffTetapRizqi(){
    System.out.println("==========Data Staff Tetap==========");
    super.tampilDataStaff();
    System.out.println("Golongan            : "+mGolongan);
    System.out.println("Jumlah Asuransi     : "+mAsuransi);
    System.out.println("Gaji Bersih         : "+(mGaji+mLembur-mPotongan-mAsuransi));
}   
    
    
    
}
