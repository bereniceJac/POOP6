/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FI.POO;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase que contiene los métodos de lo que hace una persona
 */
public class Persona {
    private String nombre,direccion, estadoCivil, ocupacion;
    private int edad;

    /**
     * Constructor vacío de persona
     */
    public Persona() {
    }
    
    /**
     * Contructor lleno de persona
     * @param nombre nombre de la persona en String
     * @param direccion dirección de la persona en String
     * @param estadoCivil estado civil de la persona en String
     * @param ocupacion ocupacion civil de la persona en String
     * @param edad edade de la persona en primitivo en int
     */
    public Persona(String nombre, String direccion,
            String estadoCivil, String ocupacion, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.edad = edad;
    }

    /**
     * Método getNombre
     * @return returna el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método que modifica el nombre de la persona
     * @param nombre nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método getDireccion
     * @return returna la direccion de la persona
     */
    public String getDireccion() {
        return direccion;
    }
    
    /**
     * Método que modifica la direccion de la persona
     * @param direccion direccion de la persona
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /**
     * Método getEdad
     * @return returna la edad de la persona
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Método que modifica la edad de la persona
     * @param edad edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * Método getEstadoCivil
     * @return returna el estado civil de la persona
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }
    
    /**
     * Modifica el estado civil de la persona
     * @param estadoCivil estado civil de la persona
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    /**
     * Método getOcupacion
     * @return returna la ocupacion de la persona
     */
    public String getOcupacion() {
        return ocupacion;
    }
    
    /**
     * Método que modifica la ocupacion de la persona
     * @param ocupacion ocupacion de la persona
     */
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    /**
     * Método que sirve para que la persona hable
     * @param palabra lo que la persona está diciendo
     */
    public void hablar(String palabra){
        System.out.println(palabra);
    } //5 métodos y 5 métodos objetivos
    
    /**
     * Método que sirve para que para indicar la distancia que camina la persona
     * @param distancia distancia que camina la persona
     */
    public void caminar(int distancia){
        System.out.println("Caminé "+distancia+ " metros");
    }
    
    /**
     * Método que sirve para indicar el trabajo de la persona
     * @param trabajo trabajo de la persona
     */
    public void trabajar(String trabajo){
        System.out.println("Trabajo "+trabajo);
    }
    
    /**
     * Método que imprime una frase que da a endender que la persona es sociable
     */
    public void socializar(){
        System.out.println("Soy sociable");
    }
    
    /**
     * Método que sirve para indicar la comida de la persona
     * @param comida comida de la persona
     */
    public void comer(String comida){
        System.out.println("Estoy comiendo "+comida);
    }

    /**
     * Método toString sobrescrito que muestra los valores de los atributos
     * @return returna una concatenación de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion +
                ", estadoCivil=" + estadoCivil + ", ocupacion=" + ocupacion +
                ", edad=" + edad + '}';
    }
    
    
    
}
