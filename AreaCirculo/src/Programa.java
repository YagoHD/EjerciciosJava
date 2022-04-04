
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio = 0; 
        System.out.println("Introduce el radio del circulo");
        radio = sc.nextDouble();
        
        double area = Math.PI*(radio*radio);
        System.out.print("El area de un circulo con radio= "+radio +" es de: ");
        System.out.format("%.3f ", area);
        System.out.println("");
    }
}
