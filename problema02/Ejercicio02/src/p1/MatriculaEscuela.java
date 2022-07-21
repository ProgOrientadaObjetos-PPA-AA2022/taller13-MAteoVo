/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import p2.Matricula;

/**
 *
 * @author reroes
 */
public class MatriculaEscuela extends Matricula{
    
    @Override
    public void establecerTarifa(){
        // tarifa = costo libros + costo deportes + costo folletos + 
        //          costo uniformes
        tarifa = 50.2 + 40.2 + 140.2 + 200.4;
    }
    public String toString(){
        String cadena = String.format("Matricula Escuela\nTarifa: %.2f\n",tarifa);
        return cadena;
    }
    
}
