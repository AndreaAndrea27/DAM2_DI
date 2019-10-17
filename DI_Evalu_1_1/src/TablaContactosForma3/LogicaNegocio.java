/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaContactosForma3;

import java.util.ArrayList;
import java.util.List;

public class LogicaNegocio {

    List<Persona> listaPersonas = new ArrayList<>();
  

    public void darAlta(Persona persona) {
        
        listaPersonas.add(persona);

    }

    public List<Persona> listarPersonas() {
        return listaPersonas;

    }
    
    

}
