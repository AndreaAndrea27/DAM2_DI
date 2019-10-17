/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaContactosForma3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Persona {

    private Date fecha;
    private String concepto;
    private float gastos;
    private float ingresos;

    public Persona(Date fecha, String concepto, float gastos, float ingresos) {
        this.fecha = fecha;
        this.concepto = concepto;
        this.gastos = gastos;
        this.ingresos = ingresos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getGastos() {
        return gastos;
    }

    public void setGastos(float gastos) {
        this.gastos = gastos;
    }

    public float getIngresos() {
        return ingresos;
    }

    public void setIngresos(float ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    public String toString() {
        return "Persona{" + "fecha=" + fecha + ", concepto=" + concepto + ", gastos=" + gastos + ", ingresos=" + ingresos + '}';
    }
    
    
    

    public String[] arrayGestion() {

        String[] src = new String[4];

        //pasamos la fecha a string para poder meterlo en el array
        src[0] = fecha.toString();
        src[1] = concepto;
        //pasamos de float a string para meterlo en el arrya
        src[2] = Float.toString(gastos);
        src[3] = Float.toHexString(ingresos);
        return src;
    }

}
