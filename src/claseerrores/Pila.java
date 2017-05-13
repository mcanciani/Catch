/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseerrores;

/**
 *
 * @author educacionit
 */
public class Pila<t>{//<> mantinene todos los elementos dle mismo tipo que yo elija (generico)
                        //ej. si pongo <int> seran int.. lo especifico cuando construyo 
                        // el objeto en el main

    private final int max;
    private t[] elementos; 
    int tope = -1;

    public Pila(int max) {
        this.max = max;
        elementos = (t[])new Object[max]; //aca creo el array
        
    }

    
    public void empujar(t e) {
        
        if ((max - 1) == tope) {
            System.out.print("error pila llena");
        } else {
            elementos[++tope] = e;
        }
    }
    
    public t sacar(){
        if (tope < 0){
        System.out.print("error pila vacía");
        return null;
        }
        else{
        t e = elementos[tope];
        elementos[tope--]=null;
        return e;
        }
    }
    
    public boolean estaVacia(){
        return(tope<0);
    }
   
    
    public void mostrar(){
        for (int i=tope; i>=0; i--){
            System.out.println(elementos[i]);
        }
    }
}
