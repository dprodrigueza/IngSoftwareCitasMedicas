/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Paciente;
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
public class ControladorPacienteTest {
    
    Paciente p = null;
    ControladorPaciente cP = null;
    
    
    public ControladorPacienteTest() {
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
     * Test of crear method, of class ControladorPaciente.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        
        boolean expResult = true;
        boolean result = cP.crear(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
       
    }
    
}
