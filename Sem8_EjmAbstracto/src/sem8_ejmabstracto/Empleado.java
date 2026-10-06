/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8_ejmabstracto;

/**
 *
 * @author UCA40416
 */
public class Empleado extends Persona
{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcular_salario_mensual(int dias_falto) 
    {
        double rpta= this.salario - ((this.salario/30)*dias_falto);
        System.out.println("El suelo mensual es: "+rpta);
    }

    @Override
    public void verDatos() 
    {
        System.out.println("EMPLEADO TIPO DOC: "+this.tipo_doc+" NRODOC: "+this.nro_doc+" Nombre: "+this.nombre+" Apelledido P: "+this.Apellido_p+" Apellido M: "+this.Apellido_m+" Fecha: "+this.fec_nac);
    
    }
    
}
