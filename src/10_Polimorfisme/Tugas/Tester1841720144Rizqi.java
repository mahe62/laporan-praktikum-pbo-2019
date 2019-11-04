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
public class Tester1841720144Rizqi {
    public static void main(String[] args) {
        WalkingZombie1841720144Rizqi wz = new WalkingZombie1841720144Rizqi(100, 1);
        JumpingZombie1841720144Rizqi jz = new JumpingZombie1841720144Rizqi(100, 1);
        Barrier1841720144Rizqi b = new Barrier1841720144Rizqi(100);
        Plant1841720144Rizqi p = new Plant1841720144Rizqi();
        System.out.println(""+wz.getZombieInfoRizqi());
        System.out.println(""+jz.getZombieInfoRizqi());
        System.out.println(""+b.getBarrierInfoRizqi());
        System.out.println("----------------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(""+wz.getZombieInfoRizqi());
        System.out.println(""+jz.getZombieInfoRizqi());
        System.out.println(""+b.getBarrierInfoRizqi());
    }
}