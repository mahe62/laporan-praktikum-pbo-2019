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
public class Utama1841720144Rizqi {
    public static void main(String[] args) {
        System.out.println("PROGRAM TESTING CLASS MANAGER DAN STAFF");
        Manager1841720144Rizqi man[]=new Manager1841720144Rizqi[2];
        Staff1841720144Rizqi stf1[]=new Staff1841720144Rizqi[2];
        Staff1841720144Rizqi stf2[]=new Staff1841720144Rizqi[3];
        
        man[0]=new Manager1841720144Rizqi();
        man[0].setmNamaRizqi("Tedjo");
        man[0].setmNipRizqi("101");
        man[0].setmGolonganRizqi("1");
        man[0].setmTunjanganRizqi(5000000);
        man[0].setmBagianRizqi("Administrasi");
        
        man[1]=new Manager1841720144Rizqi();
        man[1].setmNamaRizqi("Sujiwa");
        man[1].setmNipRizqi("102");
        man[1].setmGolonganRizqi("1");
        man[1].setmTunjanganRizqi(2500000);
        man[1].setmBagianRizqi("Marketing");
        
        
        stf1[0] = new Staff1841720144Rizqi();
        stf1[0].setmNamaRizqi("Usman");
        stf1[0].setmNipRizqi("0003");
        stf1[0].setmGolonganRizqi("2");
        stf1[0].setmLemburRizqi(10);
        stf1[0].setmGajiLemburRizqi(10000);
        
        stf1[1] = new Staff1841720144Rizqi();
        stf1[1].setmNamaRizqi("Anugrah");
        stf1[1].setmNipRizqi("0005");
        stf1[1].setmGolonganRizqi("2");
        stf1[1].setmLemburRizqi(10);
        stf1[1].setmGajiLemburRizqi(55000);
        man[0].setStRizqi(stf1);
        
        stf2[0] = new Staff1841720144Rizqi();
        stf2[0].setmNamaRizqi("Bambang");
        stf2[0].setmNipRizqi("0004");
        stf2[0].setmGolonganRizqi("3");
        stf2[0].setmLemburRizqi(15);
        stf2[0].setmGajiLemburRizqi(5500);
        
        stf2[1] = new Staff1841720144Rizqi();
        stf2[1].setmNamaRizqi("Kuntet");
        stf2[1].setmNipRizqi("0006");
        stf2[1].setmGolonganRizqi("3");
        stf2[1].setmLemburRizqi(5);
        stf2[1].setmGajiLemburRizqi(100000);
        
        stf2[2] = new Staff1841720144Rizqi();
        stf2[2].setmNamaRizqi("Mentari");
        stf2[2].setmNipRizqi("0007");
        stf2[2].setmGolonganRizqi("3");
        stf2[2].setmLemburRizqi(6);
        stf2[2].setmGajiLemburRizqi(20000);
        man[1].setStRizqi(stf2);
        
        
        man[0].lihatInfoRizqi();
        man[1].lihatInfoRizqi();
        
        
    }
}
