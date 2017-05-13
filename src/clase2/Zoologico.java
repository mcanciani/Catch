/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2; 
/**
 *
 * @author educacionit
 */
public class Zoologico{
public static final int CANTIDAD_ANIMALES = 25; 
public static final int RACIONES_POR_ANIMAL = 5; //con static pasa a ser de clase y no de instancia
boolean open;


public void abrir()
{ 
this.open = true;
        }

public void cerrar(){
this.open = false;

}
public void alimentarAnimales(int unaCantidadDeRaciones){
    
    Cuidador p1 = new Cuidador(unaCantidadDeRaciones);
    p1.alimentarAnimales();
    
}

}