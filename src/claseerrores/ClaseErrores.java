/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseerrores;

import java.io.IOException;

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
    p.empujar(555555);
    p.empujar(33);
    p.mostrar();
try{
}
catch(IOException e){

}
finally{
//util con recursos, para cerrarlos...
}
    }

                        
    /*                      --Chequeadas-- estoy obligado a hacer algo, a tomar esa acción
    throwable <- Exception  <-IO Exception 
                            <- SQLException
                            --No chequeadas-- no estoy obligado a nada.
                            <- RuntimeException
                            <-IndexOutOtboundExceptio
    */
}
