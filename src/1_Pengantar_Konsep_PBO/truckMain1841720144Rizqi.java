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
public class truckMain1841720144Rizqi {
    public static void main(String[] args) {
        truck1841720144Rizqi t1= new truck1841720144Rizqi();
        truck1841720144Rizqi t2= new truck1841720144Rizqi();
        truckTrailer1841720144Rizqi t3= new truckTrailer1841720144Rizqi();
        
        t1.merekTruckRizqi("Scania");
        t1.tambahTruckRizqi(10);
        t1.kerusakanRizqi(2);
        t1.cetakstatusRizqi();
        
        t2.merekTruckRizqi("Volvo");
        t2.tambahTruckRizqi(10);
        t2.kerusakanRizqi(2);
        t2.kerusakanRizqi(5);
        t2.kerusakanRizqi(1);
        t2.tambahTruckRizqi(11);
        t2.cetakstatusRizqi();
        
        t3.merekTruckRizqi("Hino");
        t3.tambahTruckRizqi(25);
        t3.kerusakanRizqi(7);
        t3.typeTrailerRizqi("Trailer Kayu");
        t3.cetakstatusRizqi();
        
        
    }
}
