/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author ASUS
 */
public class Segitiga1841720144Rizqi {

    private int mSudut;
    private int mKeliling;

    public int totalSudutRizqi(int sudutA) {
        mSudut = 180 - sudutA;
        return mSudut;
    }

    public int totalSudutRizqi(int sudutA, int sudutB) {
        mSudut = 180 - (sudutA + sudutB);
        return mSudut;
    }

    public int kelilingRizqi(int sudutA, int sudutB, int sudutC) {
        mKeliling = sudutA + sudutB + sudutC;
        return mKeliling;
    }

    public double kelilingRizqi(int sudutA, int sudutB) {
        double sudutC = Math.sqrt(Math.pow(sudutA, 2) + Math.pow(sudutB, 2));
        double mKeliling = sudutA + sudutB + sudutC;
        return mKeliling;
    }

    public static void main(String[] args) {
        Segitiga1841720144Rizqi sgt = new Segitiga1841720144Rizqi();
        System.out.println(sgt.kelilingRizqi(2, 3));
        System.out.println(sgt.kelilingRizqi(2, 3, 4));
        
        System.out.println(sgt.totalSudutRizqi(90));
        System.out.println(sgt.totalSudutRizqi(90, 60));

    }
}
