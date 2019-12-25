/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.controlador.ControladorMedico;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class MedicoTest {

    Medico m = null;
    ControladorMedico cM = null;

    public MedicoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws ParseException {
        cM = new ControladorMedico();

        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date fecha = format.parse("17/01/1999");

        m = new Medico(1, 2, "drodri", "cuenca", "0106630999", "diego", "rodriguez", "2864219", "Culebrillas", fecha, "Masculino");

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getMedico_id method, of class Medico.
     */
    @Test
    public void testGetMedico_id() {
        System.out.println("getMedico_id");
        
        int expResult = 1;
        int result = m.getMedico_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMedico_id method, of class Medico.
     */
    @Test
    public void testSetMedico_id() {
        System.out.println("setMedico_id");
        int medico_id = 1;
        m.setMedico_id(medico_id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMedico_numeroConsultorio method, of class Medico.
     */
    @Test
    public void testGetMedico_numeroConsultorio() {
        System.out.println("getMedico_numeroConsultorio");
        
        int expResult = 2;
        int result = m.getMedico_numeroConsultorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMedico_numeroConsultorio method, of class Medico.
     */
    @Test
    public void testSetMedico_numeroConsultorio() {
        System.out.println("setMedico_numeroConsultorio");
        int medico_numeroConsultorio = 2;
        
        m.setMedico_numeroConsultorio(medico_numeroConsultorio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMedico_usuario method, of class Medico.
     */
    @Test
    public void testGetMedico_usuario() {
        System.out.println("getMedico_usuario");
        
        String expResult = "drodri";
        String result = m.getMedico_usuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMedico_usuario method, of class Medico.
     */
    @Test
    public void testSetMedico_usuario() {
        System.out.println("setMedico_usuario");
        String medico_usuario = "drodri";
        
        m.setMedico_usuario(medico_usuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMedico_password method, of class Medico.
     */
    @Test
    public void testGetMedico_password() {
        System.out.println("getMedico_password");
        
        String expResult = "cuenca";
        String result = m.getMedico_password();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMedico_password method, of class Medico.
     */
    @Test
    public void testSetMedico_password() {
        System.out.println("setMedico_password");
        String medico_password = "cuenca";
        m.setMedico_password(medico_password);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
