/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Natalia
 */
public class PersonasClass {
    private int Doc_identidad;
    private String name;
    private String apellido;
    private String correo;

    public PersonasClass() {
    }

    public PersonasClass(int Doc_identidad, String name, String apellido, String correo) {
        this.Doc_identidad = Doc_identidad;
        this.name = name;
        this.apellido = apellido;
        this.correo = correo;
    }

    
    
    /**
     * @return the Doc_identidad
     */
    public int getDoc_identidad() {
        return Doc_identidad;
    }

    /**
     * @param Doc_identidad the Doc_identidad to set
     */
    public void setDoc_identidad(int Doc_identidad) {
        this.Doc_identidad = Doc_identidad;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
