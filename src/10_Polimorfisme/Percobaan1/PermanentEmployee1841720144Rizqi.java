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
public class PermanentEmployee1841720144Rizqi extends Employee1841720144Rizqi implements  Payable1841720144Rizqi{
private  int mSalary;

    public PermanentEmployee1841720144Rizqi(String name,int mSalary) {
        this.mName = name;
        this.mSalary = mSalary;
        
    }

    public int getmSalary() {
        return mSalary;
    }

    public void setmSalary(int mSalary) {
        this.mSalary = mSalary;
    }

    @Override
    public String getEmployeeInfoRizqi() {
        String info=  super.getEmployeeInfoRizqi()+"\n";
        info+="Registered as Permanent employee with Salary"+mSalary+"\n";
        return info;
    }

    @Override
    public int getPaymentAmount() {
    return (int)(mSalary+0.05+mSalary);
    }
    

    
}
