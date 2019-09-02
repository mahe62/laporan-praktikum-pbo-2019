/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedaDemo;

/**
 *
 * @author ASUS
 */
public class sepedaGunung1841720144Rizqi extends sepeda1841720144Rizqi {
    private String tipeSuspensi;
    
    public void setTipeSuspensiRizqi(String newValue){
        tipeSuspensi = newValue;
    }
    public void cetakStatusRizqi(){
        super.cetakstatusRizqi();
        System.out.println("Tipe suspensi: "+ tipeSuspensi);
        
    }
}
