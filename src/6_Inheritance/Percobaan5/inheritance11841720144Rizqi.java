/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan5;

/**
 *
 * @author ASUS
 */
public class inheritance11841720144Rizqi {
    public static void main(String[] args) {
        Manager1841720144Rizqi M = new Manager1841720144Rizqi();
        M.mNama="Jex";
        M.mAlamat="Jl. Turin";
        M.mUmur=25;
        M.mJk="Cowok";
        M.mGaji=5000000;
        M.mTunjangan=2000000;
        M.tampilDataManager();
        
        Staff1841720144Rizqi S =new Staff1841720144Rizqi();
        S.mNama="JexV";
        S.mAlamat="Jl. Turin2";
        S.mUmur=25;
        S.mJk="Cowok";
        S.mGaji=2000000;
        S.mLembur=500000;
        S.mPotongan=250000;
        S.tampilDataStaff();
    }
}
