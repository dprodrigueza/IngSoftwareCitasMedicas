/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Paciente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VIVIANA
 */
public class ControladorPaciente {
    
    private Connection con;
    private List<Paciente> pacientes;

    public ControladorPaciente() {
        pacientes = new ArrayList<>();
    }
    
    public boolean crear(Paciente paciente){
        pacientes.add(paciente);
        return true;
    }
    
    

   
    
}
