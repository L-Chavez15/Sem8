/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8_ejmabstracto;

import java.util.ArrayList;

/**
 *
 * @author UCA40416
 */
public class TrabajadorController 
{
    ArrayList<Persona> ListaTrabajador = new ArrayList();
    
    public void Agregar_Trabajador(Persona persona_nueva)
    {
        ListaTrabajador.add(persona_nueva);
    }
    public void Listar_Trabajador()
    {
        System.out.println("LISTA DE TRABAJADORES");
        for (Persona p : ListaTrabajador) {
            p.verDatos();
            System.out.println("----------------------------------");
        }
    }
    
}
