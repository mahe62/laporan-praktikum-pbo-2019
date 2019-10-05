/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan3;

/**
 *
 * @author ASUS
 */
public class Tabung1841720144Rizqi extends Bangun1841720144Rizqi{
    protected int mT;
    public void setSuperPhiRizqi(double phi){
        super.mPhi=phi;
    }
    public void setSuperRRizqi(int r){
        super.mR=r;
    }
    public void setTRizqi(int t){
        this.mT=t;
    }
    
    public void volume(){
        System.out.println("Volume tabung adalah: "+(super.mPhi*super.mR*super.mR*this.mT));
    }
    
}
