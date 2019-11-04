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
public class Owner1841720144Rizqi {
    public void pay(Payable1841720144Rizqi p){
        System.out.println("Totap payment = "+p.getPaymentAmount());
        if (p instanceof ElectricityBill1841720144Rizqi) {
            ElectricityBill1841720144Rizqi eb = (ElectricityBill1841720144Rizqi)p;
            System.out.println(""+eb.getBillInfo());            
        }else if (p instanceof PermanentEmployee1841720144Rizqi) {
            PermanentEmployee1841720144Rizqi pe = (PermanentEmployee1841720144Rizqi)p;
            pe.getEmployeeInfoRizqi();
            System.out.println(""+pe.getEmployeeInfoRizqi());
        }
    }
    public  void showMyEmployee(Employee1841720144Rizqi e){
        System.out.println(""+e.getEmployeeInfoRizqi());
        if (e instanceof PermanentEmployee1841720144Rizqi) {
            System.out.println("You have to pay her/him mounthly!!!");
        }else
            System.out.println("No need to pay him/her : ");
    }
}
