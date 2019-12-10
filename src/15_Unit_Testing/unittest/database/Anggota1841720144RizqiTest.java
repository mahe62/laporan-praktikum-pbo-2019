/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.util.ArrayList;
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
public class Anggota1841720144RizqiTest {
    
    public Anggota1841720144RizqiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdAnggota method, of class Anggota1841720144Rizqi.
     */
    @Test
    public void testGetIdAnggota() {
        System.out.println("getIdAnggota");
        Anggota1841720144Rizqi instance = new Anggota1841720144Rizqi();
        int expResult = 0;
        int result = instance.getIdAnggota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdAnggota method, of class Anggota1841720144Rizqi.
     */
    @Test
    public void testSetIdAnggota() {
        System.out.println("setIdAnggota");
        int idAnggota = 0;
        Anggota1841720144Rizqi instance = new Anggota1841720144Rizqi();
        instance.setIdAnggota(idAnggota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNama method, of class Anggota1841720144Rizqi.
     */
    @Test
    public void testGetNama() {
        System.out.println("getNama");
        Anggota1841720144Rizqi instance = new Anggota1841720144Rizqi();
        String expResult = "";
        String result = instance.getNama();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNama method, of class Anggota1841720144Rizqi.
     */
    @Test
    public void testSetNama() {
        System.out.println("setNama");
        String nama = "";
        Anggota1841720144Rizqi instance = new Anggota1841720144Rizqi();
        instance.setNama(nama);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlamat method, of class Anggota1841720144Rizqi.
     */
    @Test
    public void testGetAlamat() {
        System.out.println("getAlamat");
        Anggota1841720144Rizqi instance = new Anggota1841720144Rizqi();
        String expResult = "";
        String result = instance.getAlamat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlamat method, of class Anggota1841720144Rizqi.
     */
    @Test
    public void testSetAlamat() {
        System.out.println("setAlamat");
        String alamat = "";
        Anggota1841720144Rizqi instance = new Anggota1841720144Rizqi();
        instance.setAlamat(alamat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelepon method, of class Anggota1841720144Rizqi.
     */
    @Test
    public void testGetTelepon() {
        System.out.println("getTelepon");
        Anggota1841720144Rizqi instance = new Anggota1841720144Rizqi();
        String expResult = "";
        String result = instance.getTelepon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelepon method, of class Anggota1841720144Rizqi.
     */
    @Test
    public void testSetTelepon() {
        System.out.println("setTelepon");
        String telepon = "";
        Anggota1841720144Rizqi instance = new Anggota1841720144Rizqi();
        instance.setTelepon(telepon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class Anggota1841720144Rizqi.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        Anggota1841720144Rizqi instance = new Anggota1841720144Rizqi();
        Anggota1841720144Rizqi expResult = null;
        Anggota1841720144Rizqi result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class Anggota1841720144Rizqi.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Anggota1841720144Rizqi instance = new Anggota1841720144Rizqi();
        ArrayList<Anggota1841720144Rizqi> expResult = null;
        ArrayList<Anggota1841720144Rizqi> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class Anggota1841720144Rizqi.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String keyword = "";
        Anggota1841720144Rizqi instance = new Anggota1841720144Rizqi();
        ArrayList<Anggota1841720144Rizqi> expResult = null;
        ArrayList<Anggota1841720144Rizqi> result = instance.search(keyword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class Anggota1841720144Rizqi.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Anggota1841720144Rizqi instance = new Anggota1841720144Rizqi();
        instance.save();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Anggota1841720144Rizqi.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Anggota1841720144Rizqi instance = new Anggota1841720144Rizqi();
        instance.delete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
