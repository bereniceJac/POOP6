/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FI.POO;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase principal que muestra el uso de la clase Persona
 */
public class POOP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Se creo un objeto de la clase persona
         * Se incializan los valores con el método constructor lleno
         * se mandan a llamar los métodos objetivos de la persona
         */
        Persona persona=new Persona("Sandra","G.A.M.",
                "Soltera", "Estudiante",19);
        persona.hablar("Hola, soy una persona:)");
        persona.caminar(15);
        persona.socializar();
        persona.trabajar("de becaria");
        persona.comer("Pizza");
    }
    
}
