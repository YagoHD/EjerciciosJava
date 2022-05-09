import java.util.Scanner;

public class CaracterToAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el caracter ASCII a pasar a numero: ");
        char caracter = sc.next().charAt(0);
        
        int codigo = (int)caracter;
        System.out.println(codigo);
    }
}
