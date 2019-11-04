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
public class Tester31841720144Rizqi {
    public static void main(String[] args) {
        PermanentEmployee1841720144Rizqi pEmp = new PermanentEmployee1841720144Rizqi("Dedik", 500);
        InternshipEmployee1841720144Rizqi iEmp = new InternshipEmployee1841720144Rizqi("Sunarto", 5);
        ElectricityBill1841720144Rizqi eBill = new ElectricityBill1841720144Rizqi(5, "A-1");
        Employee1841720144Rizqi e[]={pEmp,iEmp};
        Payable1841720144Rizqi p[]={pEmp,eBill};
        Employee1841720144Rizqi e2[] = {pEmp, iEmp,eBill};
    }
  
}
