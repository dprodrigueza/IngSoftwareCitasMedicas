/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.modelo.Persona;
import java.util.Date;

/**
 *
 * @author VIVIANA
 */
public class Paciente extends Persona{
    
    
  public int pa_id;
  public String pa_religion;
  public String  pa_recidencia;
  public String pa_procedencia;
  public String pa_ocupacion;

    public Paciente(int pa_id, String pa_religion, String pa_recidencia, String pa_procedencia, String pa_ocupacion, String cedula, String nombres, String apellidos, String telefono, String direccion, Date fechaNacimiento, String sexo) {
        super(cedula, nombres, apellidos, telefono, direccion, fechaNacimiento, sexo);
        this.pa_id = pa_id;
        this.pa_religion = pa_religion;
        this.pa_recidencia = pa_recidencia;
        this.pa_procedencia = pa_procedencia;
        this.pa_ocupacion = pa_ocupacion;
    }

    //public Paciente() {
    //}


    public int getPa_id() {
        return pa_id;
    }

    public void setPa_id(int pa_id) {
        this.pa_id = pa_id;
    }

    public String getPa_religion() {
        return pa_religion;
    }

    public void setPa_religion(String pa_religion) {
        this.pa_religion = pa_religion;
    }

    public String getPa_recidencia() {
        return pa_recidencia;
    }

    public void setPa_recidencia(String pa_recidencia) {
        this.pa_recidencia = pa_recidencia;
    }

    public String getPa_procedencia() {
        return pa_procedencia;
    }

    public void setPa_procedencia(String pa_procedencia) {
        this.pa_procedencia = pa_procedencia;
    }

    public String getPa_ocupacion() {
        return pa_ocupacion;
    }

    public void setPa_ocupacion(String pa_ocupacion) {
        this.pa_ocupacion = pa_ocupacion;
    }


  
          
}
