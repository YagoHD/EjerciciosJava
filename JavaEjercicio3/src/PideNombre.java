import java.util.Scanner;

public class PideNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        
        System.out.println("Introduce tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Bienvenido " + nombre);
        
    }
}
