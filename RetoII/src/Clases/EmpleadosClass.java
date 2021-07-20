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
public class EmpleadosClass extends PersonasClass {

    private int salario;
    private String cargo;
    private int categoria;
    private EmpresaClass empresa;
    
    
    public EmpleadosClass() {
    }

    public EmpleadosClass(int Doc_identidad, String name, String apellido, String correo, EmpresaClass empresa) {
        super(Doc_identidad, name, apellido, correo);
        this.empresa = empresa;
    }

    
    
    /**
     * @return the salario
     */
    public int getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the categoria
     */

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

    /**
     * @return the categoria
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
}
