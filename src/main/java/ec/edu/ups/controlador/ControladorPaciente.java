/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.CitaMedica;
import ec.edu.ups.modelo.Medico;
import ec.edu.ups.modelo.Paciente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author VIVIANA
 */
public class ControladorPaciente {
    
 
    private List<Paciente> pacientes;

    public ControladorPaciente() {
        pacientes = new ArrayList<>();
    }
    
  
    public boolean crearPaaciente() throws ParseException {
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date fecha = format.parse("08/02/1998");
        Paciente pa = new Paciente(1, "Catolico", "Cuenca", "Azuay", "Estudiante", "0302652482", "Kelly", "Reyes", "2850993", "Muñoz Vernaza", fecha, "Femenino");
       

        return true;
    }
   
    
}
