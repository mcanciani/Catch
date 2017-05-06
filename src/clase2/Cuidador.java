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

    public void setCantidadDeRaciones(int cantidadDeRaciones) {
        this.cantidadDeRaciones = cantidadDeRaciones;
    
    }
     public int alimentarAnimales(int raciones)
     {
        raciones = this.cantidadDeRaciones++;
        if (raciones==255)
           {
           System.out.print("suficiente");
           }
        else 
           {    
               System.out.print("No alcanza"); 
           }
        return raciones;
     }
}
