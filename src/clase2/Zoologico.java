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
public final int cantidad_animales = 25; 
public final int raciones_por_animal = 5;
boolean open;


public void abrir()
{ 
this.open = true;
        }

public void cerrar(){
this.open = false;

}
public int alimentar(int cRaciones){

    cRaciones = raciones_por_animal;
    
    return cRaciones;
}

}