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
public abstract class Zombie1841720144Rizqi implements IDestroyable1841720144Rizqi{
    protected int mHealth;
    protected int mLevel;

    public abstract void healRizqi();

    @Override
    public abstract void destroyedRizqi();
    
    public String getZombieInfoRizqi(){
        return "";
    }
    
}
