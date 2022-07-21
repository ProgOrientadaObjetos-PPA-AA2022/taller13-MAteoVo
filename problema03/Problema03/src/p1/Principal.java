/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.*;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
        */
        
        Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");
        ArrayList<Correo> lista = new ArrayList<>();
        
        DominioGmail dominio = new DominioGmail();
        dominio.establecerDominio("gmail.com");
        Correo c = new Correo();
        c.establecerDominio(dominio);
        c.establecerUserName(e.obtenerUserName());
        c.establecerCorreo();
        
        lista.add(c);
        
                
        DomonioYahoo dominio2 = new DomonioYahoo();
        dominio2.establecerDominio("yahoo.com");
        Correo c2 = new Correo();
        c2.establecerDominio(dominio2);
        c2.establecerUserName(e.obtenerUserName());
        c2.establecerCorreo();
        
        lista.add(c2);
        
        DominioUtplEduEc dominio3 = new DominioUtplEduEc();
        dominio3.establecerDominio("utpl.edu.ec");
        Correo c3 = new Correo();
        c3.establecerDominio(dominio3);
        c3.establecerUserName(e.obtenerUserName());
        c3.establecerCorreo();
        
        lista.add(c3);
        
        DominioGobierno dominio4 = new DominioGobierno();
        dominio4.establecerDominio("gob.ec");
        Correo c4 = new Correo();
        c4.establecerDominio(dominio4);
        c4.establecerUserName(e.obtenerUserName());
        c4.establecerCorreo();
        
        lista.add(c4);
        
        DominioOutlook dominio5 = new DominioOutlook();
        dominio5.establecerDominio("hotmail.ec");
        Correo c5 = new Correo();
        c5.establecerDominio(dominio5);
        c5.establecerUserName(e.obtenerUserName());
        c5.establecerCorreo();
        e.establecerCorreos(lista);
        
        lista.add(c5);
        
        System.out.printf("%s\n", e);
        
        
    }
    
}
