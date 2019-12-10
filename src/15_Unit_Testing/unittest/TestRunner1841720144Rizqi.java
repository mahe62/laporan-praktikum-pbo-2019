/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import unittest.database.Anggota1841720144RizqiTest;
import unittest.database.Kategori1841720144RizqiTest;

/**
 *
 * @author ASUS
 */
public class TestRunner1841720144Rizqi {
    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest1841720144Rizqi.class);
        showMessageResult(mResult,MessageProcessorTest1841720144Rizqi.class.getSimpleName());
        
//        mResult = new JUnitCore().runClasses(Kategori1841720144RizqiTest.class);
//        showMessageResult(mResult, Kategori1841720144RizqiTest.class.getSimpleName());
        
         mResult = new JUnitCore().runClasses(Anggota1841720144RizqiTest.class);
        showMessageResult(mResult, Anggota1841720144RizqiTest.class.getSimpleName());

    }
    private static void showMessageResult(Result mResult, String className){
        if (mResult.wasSuccessful()) {
            System.out.format("The Result Test from %s: %s\n", className,mResult.wasSuccessful());  
        }else{
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
