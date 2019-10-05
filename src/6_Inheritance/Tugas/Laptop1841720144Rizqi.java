/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class Laptop1841720144Rizqi extends Komputer1841720144Rizqi{
    public String mJnsBatrai;

    public Laptop1841720144Rizqi() {
    }

    public Laptop1841720144Rizqi(String mJnsBatrai, String mMerek, String mJnisProsessor, int mKecProsessor, int mSizeMemory) {
        super(mMerek, mJnisProsessor, mKecProsessor, mSizeMemory);
        this.mJnsBatrai = mJnsBatrai;
    }
    public void tampilLaptopRizqi(){
        super.tampilDataRizqi();
        System.out.println("Jenis Batrai        : "+mJnsBatrai);
    }
    
}
