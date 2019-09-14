/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author ASUS
 */
public class EncapDemo184120144Rizqi {
    private String mName;
    private int mAge;
    
    public String GetNameRizqi(){
        return mName;
    }
    public void SetNamaeRizqi(String nma){
        mName = nma;
    }
    public int GetAgeRizqi(){
        return mAge;
    }
    public void SetAgeRizqi(int newAge){
        if (newAge>30) {
            mAge = 30;
            
        }else if (newAge<18) {
            mAge = 18;
        }else{
            mAge =newAge;
        }
    }
}
