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
public class Plant1841720144Rizqi {
    public void doDestroy(IDestroyable1841720144Rizqi d) {
        if (d instanceof WalkingZombie1841720144Rizqi) {
            WalkingZombie1841720144Rizqi wz = (WalkingZombie1841720144Rizqi) d;
            wz.destroyedRizqi();
        } else if (d instanceof JumpingZombie1841720144Rizqi) {
            JumpingZombie1841720144Rizqi jz = (JumpingZombie1841720144Rizqi) d;
            jz.destroyedRizqi();
        } else if (d instanceof Barrier1841720144Rizqi) {
            Barrier1841720144Rizqi b = (Barrier1841720144Rizqi) d;
            b.destroyRizqi();
        }
    }

    
}
