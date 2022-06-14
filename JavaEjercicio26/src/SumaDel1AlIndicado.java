import java.util.Scanner;

public class SumaDel1AlIndicado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica hasta que numero sumar: ");
        int numero =sc.nextInt();
        int total = 0;
        
        if (numero>1){
            for (int indice = 1; indice<=numero; indice++){
                total = indice + total;
            }
        }
        System.out.println("La suma total es de: "+ total);
    }
}
