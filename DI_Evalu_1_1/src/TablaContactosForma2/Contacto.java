/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaContactosForma2;

/**
 *
 * @author andre
 */
public class Contacto {
    
    String nombre;
    String apellidos;
    String fecha;

    public Contacto(String nombre, String apellidos, String fecha) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDate() {
        return fecha;
    }

    public void setDate(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", date=" + fecha + '}';
    }
    
          

    public String[] arrayContacto(){
        
        String[] DatosContacto = new String[3];
        
        DatosContacto[0]= nombre;
        DatosContacto[1]=apellidos;
        DatosContacto[2]=fecha;
        
        return DatosContacto;
    }

}
