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
public class Windows1841720144Rizqi extends Laptop1841720144Rizqi{
   public String mFitur;

    public Windows1841720144Rizqi() {
    }

    public Windows1841720144Rizqi(String mFitur, String mJnsBatrai, String mMerek, String mJnisProsessor, int mKecProsessor, int mSizeMemory) {
        super(mJnsBatrai, mMerek, mJnisProsessor, mKecProsessor, mSizeMemory);
        this.mFitur = mFitur;
    }
   
   public void tampilWindowsRizqi(){
       super.tampilLaptopRizqi();
       System.out.println("Fitur        : "+mFitur);
   }
}
