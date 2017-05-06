/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2; //forma de organizar mis clases

/**
 *
 * @author educacionit
 */
public class Cuidador extends Persona {
    private int cantidadDeRaciones;

    public Cuidador(int cantidadDeRaciones) {
        this.cantidadDeRaciones = cantidadDeRaciones;
    }

    public void setCantidadDeRaciones(int cantidadDeRaciones) {
        this.cantidadDeRaciones = cantidadDeRaciones;
    
    }
    
     public void alimentarAnimales()
     {
        if (cantidadDeRaciones==Zoologico.CANTIDAD_ANIMALES*Zoologico.RACIONES_POR_ANIMAL)
           {
           System.out.print("suficiente");
           }
        else 
           {    
               System.out.print("No alcanza"); 
           }
     }
}
