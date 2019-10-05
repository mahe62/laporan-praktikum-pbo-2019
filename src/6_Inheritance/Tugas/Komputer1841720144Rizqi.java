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
public class Komputer1841720144Rizqi {
    public String mMerek,mJnisProsessor;
    public int mKecProsessor,mSizeMemory;

    public Komputer1841720144Rizqi() {
    }

    public Komputer1841720144Rizqi(String mMerek, String mJnisProsessor, int mKecProsessor, int mSizeMemory) {
        this.mMerek = mMerek;
        this.mJnisProsessor = mJnisProsessor;
        this.mKecProsessor = mKecProsessor;
        this.mSizeMemory = mSizeMemory;
    }
    
    public void tampilDataRizqi(){
        System.out.println("Merk            : "+mMerek);
        System.out.println("Prosessor       : "+mJnisProsessor);
        System.out.println("KecProsessor    : "+mKecProsessor);
        System.out.println("Memory          : "+mSizeMemory);
    }
    
}
