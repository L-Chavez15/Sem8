/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package herenciamultiple_sem8;

/**
 *
 * @author UCA40416
 */
public interface Carnivoro extends Animal
{

    @Override
    public default void comer() 
    {
        System.out.println("COME CARNE");
    }
    
}
