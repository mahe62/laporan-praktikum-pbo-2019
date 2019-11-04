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
public class Barrier1841720144Rizqi implements IDestroyable1841720144Rizqi {

    private int mStrength;

    public Barrier1841720144Rizqi(int mStrength) {
        this.mStrength = mStrength;
    }

    public int getmStrength() {
        return mStrength;
    }

    public void setmStrength(int mStrength) {
        this.mStrength = mStrength;
    }

    public String getBarrierInfoRizqi() {
        return "Barrier Strength = " + getmStrength();
    }

    public void destroyRizqi() {
        destroyedRizqi();
    }

    @Override
    public void destroyedRizqi() {
        mStrength -= mStrength * 0.1;
    }

}
