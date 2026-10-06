/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem8_ejmabstracto;

import java.time.LocalDate;

/**
 *
 * @author UCA40416
 */
public class Sem8_EjmAbstracto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        TrabajadorController tc = new TrabajadorController(); 
        Empleado e1 =new Empleado();
        e1.setNombre("Leonardo");
        e1.setApellido_p("Chavez");
        e1.setApellido_m("García");
        e1.setFec_nac(LocalDate.parse("2001-01-25"));
        e1.setTipo_doc("DNI");
        e1.setNro_doc("60808399");
        tc.Agregar_Trabajador(e1);
        tc.Listar_Trabajador();
        
    }
    
}
