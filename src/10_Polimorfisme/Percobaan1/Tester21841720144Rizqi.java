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
public class Tester21841720144Rizqi {
    public static void main(String[] args) {
        PermanentEmployee1841720144Rizqi pEmp = new PermanentEmployee1841720144Rizqi("Dedik", 500);
        Employee1841720144Rizqi e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfoRizqi());
        System.out.println("---------------------------");
        System.out.println(""+pEmp.getEmployeeInfoRizqi());
    }
}
