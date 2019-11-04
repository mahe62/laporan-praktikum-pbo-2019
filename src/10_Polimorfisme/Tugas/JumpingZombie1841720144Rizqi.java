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
public class JumpingZombie1841720144Rizqi extends Zombie1841720144Rizqi {

    public JumpingZombie1841720144Rizqi(int mHealth, int mLevel) {
        this.mHealth = mHealth;
        this.mLevel = mLevel;
    }

    @Override
    public void healRizqi() {
        switch (mLevel) {
            case 1:
                mHealth = mHealth + (mHealth * 30 / 100);
                break;
            case 2:
                mHealth = mHealth + (mHealth * 40 / 100);
                break;
            case 3:
                mHealth = mHealth + (mHealth * 50 / 100);
                break;
            default:
                break;
        }
    }

    @Override
    public void destroyedRizqi() {
        mHealth -= mHealth * 0.01;
    }

    @Override
    public String getZombieInfoRizqi() {
        String info = "Jumping Zombie Data = \n"
                + "Health = " + mHealth + "\n"
                + "Level = " + mLevel;
        return info;
    }

}
