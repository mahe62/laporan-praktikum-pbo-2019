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
public class Processor1841720144Rizqi {

    private String mMerk;
    private double mCache;

    public Processor1841720144Rizqi(String merk, double cache) {
        this.mMerk = merk;
        this.mCache = cache;
    }

    public Processor1841720144Rizqi() {
    }

    public String getmMerkRizqi() {
        return mMerk;
    }

    public void setmMerkRizqi(String mMerk) {
        this.mMerk = mMerk;
    }

    public double getmCacheRizqi() {
        return mCache;
    }

    public void setmCacheRizqi(double mCache) {
        this.mCache = mCache;
    }
    
    

    public void SetCacheRizqi(double cache) {
        this.mCache = cache;
    }

    public void infoRizqi() {
        System.out.printf("Merk Processor = %s\n", mMerk);
        System.out.printf("Cache Memory = %.2f\n", mCache);
    }
    
}
