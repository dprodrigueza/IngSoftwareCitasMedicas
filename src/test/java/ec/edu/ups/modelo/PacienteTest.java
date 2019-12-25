/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.controlador.ControladorPaciente;
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
public class PacienteTest {

    Paciente p = null;
    ControladorPaciente cP = null;

    public PacienteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws ParseException {
        cP = new ControladorPaciente();

        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date fecha = format.parse("17/01/1999");
        p = new Paciente(1, "Catolico", "Cuenca", "Azuay", "Estudiante", "0101585933", "Maria", "Romero", "2864219", "Culebrillas y Mantense", fecha, "Femenino");

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getPa_id method, of class Paciente.
     */
    @Test
    public void testGetPa_id() {
        System.out.println("getPa_id");
        
        int expResult = 1;
        int result = p.getPa_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPa_id method, of class Paciente.
     */
    @Test
    public void testSetPa_id() {
        System.out.println("setPa_id");
        int pa_id = 1;
        
        p.setPa_id(pa_id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPa_religion method, of class Paciente.
     */
    @Test
    public void testGetPa_religion() {
        System.out.println("getPa_religion");
        
        String expResult = "Catolico";
        String result = p.getPa_religion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPa_religion method, of class Paciente.
     */
    @Test
    public void testSetPa_religion() {
        System.out.println("setPa_religion");
        String pa_religion = "Catolico";
        p.setPa_religion(pa_religion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPa_recidencia method, of class Paciente.
     */
    @Test
    public void testGetPa_recidencia() {
        System.out.println("getPa_recidencia");
        String expResult = "Cuenca";
        String result = p.getPa_recidencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPa_recidencia method, of class Paciente.
     */
    @Test
    public void testSetPa_recidencia() {
        System.out.println("setPa_recidencia");
        String pa_recidencia = "Cuenca";
        p.setPa_recidencia(pa_recidencia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPa_procedencia method, of class Paciente.
     */
    @Test
    public void testGetPa_procedencia() {
        System.out.println("getPa_procedencia");
        String expResult = "Azuay";
        String result = p.getPa_procedencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPa_procedencia method, of class Paciente.
     */
    @Test
    public void testSetPa_procedencia() {
        System.out.println("setPa_procedencia");
        String pa_procedencia = "Azuay";
        p.setPa_procedencia(pa_procedencia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPa_ocupacion method, of class Paciente.
     */
    @Test
    public void testGetPa_ocupacion() {
        System.out.println("getPa_ocupacion");
        String expResult = "Estudiante";
        String result = p.getPa_ocupacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPa_ocupacion method, of class Paciente.
     */
    @Test
    public void testSetPa_ocupacion() {
        System.out.println("setPa_ocupacion");
        String pa_ocupacion = "Estudiante";
        p.setPa_ocupacion(pa_ocupacion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
