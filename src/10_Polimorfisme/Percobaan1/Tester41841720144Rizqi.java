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
public class Tester41841720144Rizqi {

    public static void main(String[] args) {
        Owner1841720144Rizqi ow = new Owner1841720144Rizqi();
        ElectricityBill1841720144Rizqi eBill = new ElectricityBill1841720144Rizqi(5, "R-1");
        ow.pay(eBill);
        System.out.println("----------------------------------");

        PermanentEmployee1841720144Rizqi pEmp = new PermanentEmployee1841720144Rizqi("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("----------------------------------");

        InternshipEmployee1841720144Rizqi iEmp = new InternshipEmployee1841720144Rizqi("Sunarto", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("----------------------------------");
        ow.showMyEmployee(iEmp);
    }

}
