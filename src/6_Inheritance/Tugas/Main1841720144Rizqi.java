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
public class Main1841720144Rizqi {
    public static void main(String[] args) {
        Mac1841720144Rizqi mac=new Mac1841720144Rizqi("AMAN", "ALKALINE", "APPLE", "Intel", 3, 8);
        mac.tampilMacRizqi();
        System.out.println();
        Windows1841720144Rizqi win=new Windows1841720144Rizqi("OBAH DEWE", "ALKALINE", "ASUS", "AMD", 3, 16);
        win.tampilWindowsRizqi();
        System.out.println();
        PC1841720144Rizqi pc=new PC1841720144Rizqi(24, "GIGABYTE", "INTEL", 5, 32);
        win.tampilWindowsRizqi();
        System.out.println();
    }
}
