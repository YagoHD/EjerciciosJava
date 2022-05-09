import java.util.Scanner;

public class CaracterAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero a trasnsformar en ASCII: ");
        int numero = sc.nextInt();

        char caracter = (char)numero;
        System.out.println(caracter);
    }
}
