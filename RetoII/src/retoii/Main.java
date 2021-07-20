/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoii;

import Clases.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Natalia
 */
public class Main {
    
    private static Scanner inst_entrada_datos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_PURPLE = "\u001B[35m";    
    private static int opciones;
    
    public static void empleados_crud(){
        ArrayList<EmpleadosClass> lista_empleados = new ArrayList<>();
        boolean salir_sistema = false;
        while (!salir_sistema){
            System.out.println(ANSI_PURPLE + "Ingresa la opción a realizar" + ANSI_RESET);
            System.out.println("\n");
            System.out.println("    1. Crear empleado");
            System.out.println("    2. Listar empleados existentes");
            System.out.println("    3. Eliminar empleado");
            System.out.println("    4. modificar información de empleado");
            System.out.println(ANSI_RED + "    5. Salir del programa" + ANSI_RESET);
            
            opciones = Integer.parseInt(inst_entrada_datos.nextLine());
            
            switch(opciones){
                case 1:
                    
                    //EmpleadosClass empleados = new EmpleadosClass();
                    System.out.println(ANSI_PURPLE + "Cantidad de empleados para añadir" + ANSI_RESET);
                    int cantidad_empleados = Integer.parseInt(inst_entrada_datos.nextLine());
                    for (int i = 1; i <= cantidad_empleados; i++){
                        System.out.println(ANSI_BLUE + "Ingresa la información del empleado " +ANSI_RESET + + i);
                        System.out.println(ANSI_BLUE + "\nNombre: " + ANSI_RESET);
                        String name = inst_entrada_datos.nextLine();
                        System.out.println(ANSI_BLUE + "Apellidos: " + ANSI_RESET);
                        String apellido = inst_entrada_datos.nextLine();
                        System.out.println(ANSI_BLUE + "Documento de identidad: " + ANSI_RESET);
                        int Doc_identidad = Integer.parseInt(inst_entrada_datos.nextLine());
                        System.out.println(ANSI_BLUE + "Salario: " + ANSI_RESET);
                        int salario = Integer.parseInt(inst_entrada_datos.nextLine());
                        System.out.println(ANSI_BLUE + "Correo electrónico: " + ANSI_RESET);
                        String correo = inst_entrada_datos.nextLine();
                        //System.out.println("Empresa: ");
                        //empleados.setCorreo(inst_entrada_datos.nextLine());
                        System.out.println(ANSI_BLUE + "Categortia: " + ANSI_RESET);
                        int categoria = Integer.parseInt(inst_entrada_datos.nextLine());
                        //String nombre_cargo = "";
                        //if(empleados.getCategoria() == 1){
                          //  AdministrativosClass admon = new AdministrativosClass(5);
                            //nombre_cargo = "Administrador";
                            //System.out.println("Subordinados a cargo " + admon.getNum_subordinados());
                        //}else if(empleados.getCategoria() == 2){
                          //  nombre_cargo = "Subordinado";
                        //}else{
                          //  System.out.println("Cargo invalido");
                        //}
                        //System.out.println("Categortia: " + nombre_cargo);
                        EmpresaClass empresa = new EmpresaClass("UNIAJC", "1234-6", "Av 6ta");
                        EmpleadosClass inst_empleado = new EmpleadosClass(Doc_identidad, name, apellido, correo, empresa);
                        lista_empleados.add(inst_empleado);
                        //empleados.setEmpresa(empresa);
                        //lista_empleados.add(inst_empleado);
                        //System.out.println("\nEmpleado creado con éxito");
                        //System.out.println("\nNombre: " + empleados.getName());
                        //System.out.println("Apellido:  " + empleados.getApellido());
                        //System.out.println("Documento de identidad: " + empleados.getDoc_identidad());
                        //System.out.println("Correo electrónico: " + empleados.getCorreo());
                        //System.out.println("Empresa: " + empleados.getEmpresa());
                        //System.out.println("Categoria: " + empleados.getCategoria());
                        //System.out.println("Salario: " + empleados.getSalario());
                    }
                    break;
                case 2:
                    System.out.println("Total empleados registrados " + lista_empleados.size());
                    for (int i = 0; i < lista_empleados.size(); i++) {
                        System.out.println("\nInformación empleado " + (i + 1));
                        EmpleadosClass empleados_get = (EmpleadosClass) lista_empleados.get(i);
                        System.out.println("\nNombre: " + empleados_get.getName());
                        System.out.println("Apellido: " + empleados_get.getApellido());
                        System.out.println("Documento de identidad: " + empleados_get.getDoc_identidad());
                        System.out.println("Empresa: " + empleados_get.getEmpresa());
                        System.out.println("Salario: " + empleados_get.getSalario());
                        String nombre_cargo = "";
                        if (empleados_get.getCategoria() == 1) {
                            AdministrativosClass admin = new AdministrativosClass(5);
                            nombre_cargo = "Administrador";
                            System.out.println("Categoria: " + nombre_cargo + "\nSubordinados a cargo: " + admin.getNum_subordinados());
                        } else if (empleados_get.getCategoria() == 2) {
                            nombre_cargo = "Subordinado";
                            System.out.println("Categoria: " + nombre_cargo);
                        } else {
                            System.out.println("Cargo inválido");
                        }
                        
                    }
                    break;
                    
                case 3:
                    System.out.println(ANSI_PURPLE + "Eliminar empleado" + ANSI_RESET);
                    System.out.println(ANSI_PURPLE + "Por favor indica el indice del empleado a eliminar" + ANSI_RESET);
                    int indice_e = Integer.parseInt(inst_entrada_datos.nextLine());
                    if(indice_e >= 0 && indice_e <= lista_empleados.size()){
                        EmpleadosClass empleados_get = (EmpleadosClass) lista_empleados.get(indice_e);
                        System.out.println("Información del empleado");
                        System.out.println("Nombre del empleado: " + empleados_get.getName());
                        System.out.println(ANSI_RED + "Seguro desea eliminar a " + empleados_get.getName() + "? (Sí, No)" + ANSI_RESET);
                        String eliminar_dato = inst_entrada_datos.nextLine();
                        if (eliminar_dato.toLowerCase().equals("si") || eliminar_dato.toLowerCase().equals("sí")) {
                            lista_empleados.remove(indice_e);
                            System.out.println(ANSI_BLUE + "Base de datos actualizada" + ANSI_RESET);
                            for (int i = 0; i < lista_empleados.size(); i++) {
                                System.out.println("\n" + ANSI_BLUE + "            Persona" + (i + 1) + ANSI_RESET);
                                EmpleadosClass lista_actual = lista_empleados.get(i);
                                System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + lista_actual.getName());
                                System.out.println(ANSI_BLUE + "Apellido: " + ANSI_RESET + lista_actual.getApellido());
                                System.out.println(ANSI_BLUE + "Documento de identidad: " + ANSI_RESET + lista_actual.getDoc_identidad());
                                System.out.println(ANSI_BLUE + "Empresa: " + ANSI_RESET + lista_actual.getEmpresa());
                                System.out.println(ANSI_BLUE + "Categoria: " + ANSI_RESET + lista_actual.getCategoria());
                                System.out.println(ANSI_BLUE + "Salario: " + ANSI_RESET + lista_actual.getSalario());
                            }
                        } else {
                            System.out.println(ANSI_BLUE + "Cancelando proceso" + ANSI_RESET);
                        }
                    }
                    break;
                            
                case 4:
                    System.out.println(ANSI_PURPLE + "Editar empleado" + ANSI_RESET);
                    System.out.println(ANSI_PURPLE + "Por favor indica el indice del empleado a modificar" + ANSI_RESET);
                    int indice = Integer.parseInt(inst_entrada_datos.nextLine());
                    if(indice >= 0 && indice <= lista_empleados.size()){
                        EmpleadosClass empleados_get = (EmpleadosClass) lista_empleados.get(indice);
                        System.out.println("Información actual del empleado");
                        System.out.println("\nNombre: " + empleados_get.getName());
                        System.out.println("Apellido: " + empleados_get.getApellido());
                        System.out.println("Documento de identidad: " + empleados_get.getDoc_identidad());
                        System.out.println("Salario: " + empleados_get.getSalario());
                        System.out.println("Categoria: " + empleados_get.getCategoria());
                        System.out.println("Qué dato deseas editar? \n1. Nombre \n2. Apellido \n3. Salario \n4. Categoria");
                        int opcion_editar = Integer.parseInt(inst_entrada_datos.nextLine());
                        switch(opcion_editar){
                            case 1:
                                System.out.println("Nombre nuevo: ");
                                String name = inst_entrada_datos.nextLine();
                                empleados_get.setName(name);
                                break;
                            case 2:
                                System.out.println("Apellido nuevo: ");
                                String apellido = inst_entrada_datos.nextLine();
                                empleados_get.setApellido(apellido);
                                break;
                            case 3:
                                System.out.println("Salario nuevo: ");
                                int salario = Integer.parseInt(inst_entrada_datos.nextLine());
                                empleados_get.setSalario(salario);
                                break;
                            case 4:
                                System.out.println("Categoria nueva: ");
                                int categoria = Integer.parseInt(inst_entrada_datos.nextLine());
                                empleados_get.setCategoria(categoria);
                                break;
                            default:
                                System.out.println("Opción invalida");
                        }
                    }
                    break;
                    
                case 5:
                    salir_sistema = true;
                    System.out.println("Saliendo del programa");
                    break;
                    
                default:
                    System.out.println("Opción invalida");
            }
        
        }
    }

    public static void clientes_crud(){
        ArrayList<ClientesClass> lista_clientes = new ArrayList<>(); 
    }
        
    public static void empresas_crud(){
        ArrayList<EmpresaClass> lista_empresas = new ArrayList<>();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        empleados_crud();
    }
    
}
