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
public class Laptop1841720144Rizqi {

    private String mMerk;
    private Processor1841720144Rizqi mProc;

    public Laptop1841720144Rizqi(String merk, Processor1841720144Rizqi proc) {
        this.mMerk = merk;
        this.mProc = proc;
    }

    public Laptop1841720144Rizqi() {
    }

    public String getmMerkRizqi() {
        return mMerk;
    }

    public void setmMerkRizqi(String mMerk) {
        this.mMerk = mMerk;
    }

    public Processor1841720144Rizqi getmProcRizqi() {
        return mProc;
    }

    public void setmProcRizqi(Processor1841720144Rizqi mProc) {
        this.mProc = mProc;
    }


    public void infoRizqi() {
        System.out.println("Merk Laptop = " + mMerk);
        mProc.infoRizqi();
    }
}
