/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class Kategori1841720144RizqiTest extends TestCase{
    
    Kategori1841720144Rizqi instance;
    public Kategori1841720144RizqiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Kategori1841720144Rizqi("Comics", "Kompinasi tulisan dan gambar");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
    System.out.format("Finish Test : %s \n", this.getName());
    }

   

    /**
     * Test of search method, of class Kategori1841720144Rizqi.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String keyword = "Comics";
//        Kategori1841720144Rizqi instance = new Kategori1841720144Rizqi();
        ArrayList<Kategori1841720144Rizqi> expResult = instance.getByNamaAndKeterangan(keyword, "");
        ArrayList<Kategori1841720144Rizqi> result = instance.search(keyword);
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class Kategori1841720144Rizqi.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        this.instance.save();
        ArrayList<Kategori1841720144Rizqi> expResult = instance.getByNamaAndKeterangan(instance.getNama(), instance.getKeterangan());
        assertTrue(expResult.size()>0);
//        Kategori1841720144Rizqi instance = new Kategori1841720144Rizqi();
//        instance.save();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Kategori1841720144Rizqi.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Kategori1841720144Rizqi instance = new Kategori1841720144Rizqi();
        instance.delete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Kategori1841720144Rizqi.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Kategori1841720144Rizqi instance = new Kategori1841720144Rizqi();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
