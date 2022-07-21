/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioMatriculas;
    private ArrayList<Matricula> matriculas;

    public void establecerMatriculas(ArrayList<Matricula> ma) {
        matriculas = ma;
    }

    public ArrayList<Matricula> obtenerMatriculas() {
        return matriculas;
    }

    public void establecerPromedioTarifas() {
        for (int i = 0; i < matriculas.size(); i++) {
            promedioMatriculas += matriculas.get(i).obtenerTarifa();
        }
        promedioMatriculas = promedioMatriculas / matriculas.size();
    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }
    public String toString(){
        String cadena = "";
        for (int i = 0; i < matriculas.size(); i++) {
            cadena = String.format("%s(%d)%s\n",cadena,i+1,matriculas.get(i));
        }
        cadena = String.format("%sPromedio tarifas: %.2f",cadena,promedioMatriculas);
        return cadena;
    }
}
