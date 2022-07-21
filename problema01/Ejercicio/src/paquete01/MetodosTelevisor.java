/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author mateovalarezoojeda
 */
public class MetodosTelevisor {

    private double totalPrecioTvs;
    private double televisorMasCaro;
    private String listaMarcasVendidas;
    private ArrayList<Televisor> t;

    public ArrayList<Televisor> obtenerT() {
        return t;
    }

    public void establecerT(ArrayList<Televisor> t) {
        this.t = t;
    }

    public void establecertotalPrecioTvs() {
        for (int i = 0; i < t.size(); i++) {
            totalPrecioTvs = totalPrecioTvs + t.get(i).obtenerPrecio();
        }
    }
    public double obtenerTotalPreecioTvs(){
        return totalPrecioTvs;
    }

    public void establecerTelevisorMasCaro() {
        televisorMasCaro = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).obtenerPrecio() > televisorMasCaro) {
                televisorMasCaro = t.get(i).obtenerPrecio();
            }
        }
    }

    public double obtenerTelevisorMasCaro() {
        return televisorMasCaro;
    }

    public void establecerlistaMarcasVendidas() {
        listaMarcasVendidas = "";
        for (int i = 0; i < t.size(); i++) {
            listaMarcasVendidas = String.format("%s%s\n", listaMarcasVendidas, t.get(i).obtenerMarca());
        }
    }

    public String obtenerListaMarcasVendidas() {
        return listaMarcasVendidas;
    }
}
