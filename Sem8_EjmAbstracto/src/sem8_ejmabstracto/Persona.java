/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8_ejmabstracto;

import java.time.LocalDate;

/**
 *
 * @author UCA40416
 */
public abstract class Persona 
{
    protected String nombre;
    protected String Apellido_p;
    protected String Apellido_m;
    protected String tipo_doc;
    protected String nro_doc;
    protected LocalDate fec_nac;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_p() {
        return Apellido_p;
    }

    public void setApellido_p(String Apellido_p) {
        this.Apellido_p = Apellido_p;
    }

    public String getApellido_m() {
        return Apellido_m;
    }

    public void setApellido_m(String Apellido_m) {
        this.Apellido_m = Apellido_m;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getNro_doc() {
        return nro_doc;
    }

    public void setNro_doc(String nro_doc) {
        this.nro_doc = nro_doc;
    }

    public LocalDate getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(LocalDate fec_nac) {
        this.fec_nac = fec_nac;
    }
    
    //vamos a declarar como abstracto 
    public abstract void verDatos();
    
}
