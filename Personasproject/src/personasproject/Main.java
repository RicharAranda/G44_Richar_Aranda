/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personasproject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Natalia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inst_scanner = new Scanner(System.in);
        Date fecha_actual = new Date();
        SimpleDateFormat formato_fecha = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Personas registradas");
        PersonaClass inst_persona = new PersonaClass("Alberto", 'M', "C.C", 1010, formato_fecha.Format(fecha_actual), "Unión libre", 1);
        System.out.println(inst_persona.consultar_persona());
        System.out.println("\nIngresa el documento de identidad de la persona a consultar:");
        int doc_identidad = inst_scanner.nextInt();
        inst_persona.consultar_informacion_persona(doc_identidad);        
    }

}
