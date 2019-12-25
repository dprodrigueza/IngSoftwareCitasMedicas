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
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author VIVIANA
 */
public class ControladorCitaMedica {

    private List<CitaMedica> citaMedica;

    public ControladorCitaMedica() {
        citaMedica = new ArrayList<>();

    }

    public boolean crear() throws ParseException {
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date fecha = format.parse("17/01/1999");
        Paciente paciente = new Paciente(1, "Catolico", "Cuenca", "Azuay", "Estudiante", "0101585933", "Maria", "Romero", "2864219", "Culebrillas y Mantense", fecha, "Femenino");
        Medico medico = new Medico(1, 2, "drodri", "cuenca", "0106630999", "diego", "rodriguez", "2864219", "Culebrillas", fecha, "Masculino");

        CitaMedica cm = new CitaMedica(1, fecha, "09:00", "Dolor de Estómago", medico, paciente);

        return true;
    }

    /*
    public void crear(CitaMedica cm) {
        String sql = "INSERT INTO cita_medica VALUES ( " + cm.getCita_id()+"'" + cm.getCita_fecha()+"', '" + cm.getCita_hora()+ "' , '"
                + cm.getCita_motivo()+ "', '" + cm.getMedico()+ "', '" + cm.getPaciente()+"' ,'"+");";
        
        System.out.println(""+sql);
        
        try {
            conectar();
            Statement sta = con.createStatement();
            sta.executeUpdate(sql);
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
            System.out.println(sql);
        }
    }
    
    
    public void eliminar(int id) {
         String sql = "DELETE FROM cita_medica WHERE  cita_id  =" + id + ";";
        try {
            conectar();
            Statement sta = con.createStatement();
            sta.executeUpdate(sql);
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }
    }

      public CitaMedica buscar(int id) {

        String sql = "SELECT * FROM cita_medica WHERE  cita_id  ='"  + id + "';";
        
        //System.out.println(sql);
         
        try {
            conectar();
            Statement sta = con.createStatement();
            ResultSet reset = sta.executeQuery(sql);
            while (reset.next()) {
                CitaMedica c = new CitaMedica(id);
                //c.setIdCliente(reset.getInt(1));
                c.setCita_fecha(reset.getDate(1));
                c.setCita_hora(reset.getTime(2));
                c.setCita_motivo(reset.getString(3));
                
               
                //System.out.println("cedula sy existe");
                return c;
                
            }
            System.out.println("la cita no existe");
           
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }
        return null;
    }
     
    
     public void actualizar(CitaMedica cm, int id) {
         
         
    String sql = "UPDATE cita_medica  SET   cita_id  = '" + cm.getCita_id()
            + "', cita_fecha = '" + cm.getCita_fecha()
            + "', cita_hora = '" + cm.getCita_hora()
            + "', cita_motivo = '"+ cm.getCita_motivo()
            + "', cita_medico = '" + cm.getMedico()
            + "', cita_paciente = '" + cm.getPaciente()
          
                + " WHERE cita_id ='" + id + "';";
        System.out.println(sql);
        try {
            conectar();
            Statement sta = con.createStatement();
            sta.executeUpdate(sql);
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error  " + ex.getMessage());
        }
    }
     */
}
