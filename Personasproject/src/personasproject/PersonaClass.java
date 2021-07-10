/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personasproject;

import java.util.Date;

/**
 *
 * @author Natalia
 */
public class PersonaClass {
    private String nombre;
    private char sexo;
    private String tipo_documento;
    private int doc_identidad;
    private Date fecha_nacimiento;
    private String estado_civil;
    private int cantidad_hijos;

    public PersonaClass(String nombre, char sexo, String tipo_documento, int doc_identidad, Date fecha_nacimiento, String estado_civil, int cantidad_hijos) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.tipo_documento = tipo_documento;
        this.doc_identidad = doc_identidad;
        this.fecha_nacimiento = fecha_nacimiento;
        this.estado_civil = estado_civil;
        this.cantidad_hijos = cantidad_hijos;
    }
    
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the tipo_documento
     */
    public String getTipo_documento() {
        return tipo_documento;
    }

    /**
     * @param tipo_documento the tipo_documento to set
     */
    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    /**
     * @return the doc_identidad
     */
    public int getDoc_identidad() {
        return doc_identidad;
    }

    /**
     * @param doc_identidad the doc_identidad to set
     */
    public void setDoc_identidad(int doc_identidad) {
        this.doc_identidad = doc_identidad;
    }

    /**
     * @return the fecha_nacimiento
     */
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * @return the estado_civil
     */
    public String getEstado_civil() {
        return estado_civil;
    }

    /**
     * @param estado_civil the estado_civil to set
     */
    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    /**
     * @return the cantidad_hijos
     */
    public int getCantidad_hijos() {
        return cantidad_hijos;
    }

    /**
     * @param cantidad_hijos the cantidad_hijos to set
     */
    public void setCantidad_hijos(int cantidad_hijos) {
        this.cantidad_hijos = cantidad_hijos;
    }
    
    public String consultar_persona(){
        return "    Su nombre es: " + getNombre() + "\n    Su sexo es: " + getSexo()
        + "\n    Tipo de documento: " + getTipo_documento() + "\n    Su número de identidad es: " 
        + getDoc_identidad() + "\n    Su fecha de nacimiento es: " + getFecha_nacimiento()
        + "\n    Su estado cívil es: " + getEstado_civil() + "\n    Tiene: " + getCantidad_hijos() 
        + " hijos" ;
    }
    
    public void consultar_informacion_persona(int doc_identidad){
        if (getDoc_identidad() == (doc_identidad)){
            System.out.println("    Su nombre es: " + getNombre() + "\n    Su sexo es: " + getSexo()
        + "\n    Tipo de documento: " + getTipo_documento() + "\n    Su número de identidad es: " 
        + getDoc_identidad() + "\n    Su fecha de nacimiento es: " + getFecha_nacimiento()
        + "\n    Su estado cívil es: " + getEstado_civil() + "\n    Tiene: " + getCantidad_hijos() 
        + " hijos");
        }else{
            System.out.println("La persona no se encuentra en la base de datos");
        }
    }
}