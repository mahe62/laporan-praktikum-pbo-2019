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
import java.util.*;
public class DemoHashSet1841720144Rizqi {
    public static void main(String[] args) {
        Set mSetCity = new  HashSet();
        mSetCity.add("Malang");
        mSetCity.add("Banyuwangi");
        mSetCity.add("Jogjakarta");
        mSetCity.add("Batu");
        

        
        System.out.println(mSetCity);
        Iterator<String> mIterator = mSetCity.iterator();
        while (mIterator.hasNext()){
            System.out.println(mIterator.next().toLowerCase());
        }
    }
}
