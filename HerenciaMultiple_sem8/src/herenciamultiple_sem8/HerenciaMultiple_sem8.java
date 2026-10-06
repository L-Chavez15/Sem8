/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciamultiple_sem8;

/**
 *
 * @author UCA40416
 */
public class HerenciaMultiple_sem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Omnivoro o1=new Omnivoro();
        o1.setCodigo("001");
        o1.setNombre("leonardo");
        System.out.println(o1);
        o1.comer();
    }
    
}
