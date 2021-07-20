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
public class ClientesClass extends PersonasClass{

    private String direccion;
    private int telefono;
    private EmpresaClass empresa;
    
    public ClientesClass() {
    }

    public ClientesClass(int Doc_identidad, String name, String apellido, String correo) {
        super(Doc_identidad, name, apellido, correo);
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the empresa
     */
    public EmpresaClass getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(EmpresaClass empresa) {
        this.empresa = empresa;
    }
    
}
