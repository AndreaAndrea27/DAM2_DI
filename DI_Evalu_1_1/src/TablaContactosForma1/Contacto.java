/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaContactosForma1;

import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class Contacto {
    
    private  String nombre;
    private String apellidos;
    private String telefono;

    public Contacto(String nombre, String apellidos, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    Contacto(JTextField jTextField_Nombre, JTextField jTextField_apellidos, JTextField jTextField_Telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + '}';
    }
    
    //hacemos este metodo para que nos devuelva un array con los datos y lo podamos introducir en la tabla 
    public String[] ContactosArray (){
        
        String[] Contacto= new String[3];
        
        Contacto[0]=nombre;
        Contacto[1]=apellidos;
        Contacto[2]=telefono;
        
        return Contacto;
        

        
    }
    

    
}
