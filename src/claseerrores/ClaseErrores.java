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
public class ClaseErrores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 Pila<Integer> p = new Pila(5); //datos primitivos NO, sólo clases.
                                        //int> Integer.
           
        p.empujar(1);
        p.empujar(1433);
        
        p.empujar(2414);
        
        p.empujar(1333);
        p.mostrar();   // TODO code application logic here
    }

                        
    /*                      --Chequeadas-- estoy obligado a hacer algo, a tomar esa acción
    throwable <- Exception  <-IO Exception 
                            <- SQLException
                            --No chequeadas-- no estoy obligado a nada.
                            <- RuntimeException
                            <-IndexOutOtboundExceptio
    */
}
