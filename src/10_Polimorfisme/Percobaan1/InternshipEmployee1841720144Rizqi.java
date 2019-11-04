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
public class InternshipEmployee1841720144Rizqi extends Employee1841720144Rizqi{
    private int mLength;

    public InternshipEmployee1841720144Rizqi(String name,int mLength) {
        this.mLength = mLength;
        this.mName = name; 
    }

    public int getmLength() {
        return mLength;
    }

    public void setmLength(int mLength) {
        this.mLength = mLength;
    }

    @Override
    public String getEmployeeInfoRizqi() {
        String info = super.getEmployeeInfoRizqi()+"\n";
        info += "Registered as intership empoyee for "+mLength+" month/s\n";
        return info;
    }
   
}
