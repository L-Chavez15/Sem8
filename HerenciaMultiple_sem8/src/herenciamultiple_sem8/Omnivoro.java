/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamultiple_sem8;

/**
 *
 * @author UCA40416
 */
public class Omnivoro implements Carnivoro, Herbivoro
{
    private String Codigo;
    private String Nombre;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Omnivoro{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + '}';
    }
    
    @Override
    public void comer() {
        Carnivoro.super.comer();
        System.out.println(" V ");
        Herbivoro.super.comer();
    }
    
}
