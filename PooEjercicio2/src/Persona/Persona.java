
package Persona;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    
    
    
    
    public boolean esMayorDeEdad(int edad){
        if (this.edad>edad){
            return true;
        }else return false;
        
    }
}
