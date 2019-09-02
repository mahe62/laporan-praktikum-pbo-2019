/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truck;

/**
 *
 * @author ASUS
 */
public class truckTrailer1841720144Rizqi extends truck1841720144Rizqi{
    private String jenisTrailer;
    
    public  void typeTrailerRizqi(String tril){
        jenisTrailer = tril;
    }
    public void cetakstatusRizqi(){
        super.cetakstatusRizqi();
        System.out.println("Jenis Trailer: "+jenisTrailer);
    }
}
