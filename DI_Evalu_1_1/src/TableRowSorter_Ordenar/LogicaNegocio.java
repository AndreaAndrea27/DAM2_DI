
package TableRowSorter_Ordenar;

import TablaContactosForma2.*;
import java.util.ArrayList;
import java.util.List;



public class LogicaNegocio {
    
  
    
    
    public static List<Contacto> listaContactos= new ArrayList<>();
    
    public static void aniadirContacto(Contacto contacto){
        listaContactos.add(contacto);
    }

    public static List<Contacto> gestListaContactos() {
        return listaContactos;
    }
    
    
    
}
