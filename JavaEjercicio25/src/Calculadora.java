//import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  sc.useLocale(Locale.US);
        double operando1, operando2, resultado =0;
        System.out.println("Escribe el operando 1: ");
        operando1 = sc.nextDouble();
        
        System.out.println("Escribe el codigo de operacion: ");
        String operacion = sc.next();
        
        System.out.println("Escribe el operando 2: ");
        operando2 = sc.nextDouble();
        
        switch (operacion) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
                
            case "*":
                resultado = operando1 * operando2;
                break;
                
            case "/":
                resultado = operando1 / operando2;
                break;
            case "^":
                resultado = Math.pow(operando1, operando2);
                break;
            case "%":
                resultado = operando1 % operando2;
                break;
        }
        System.out.println("El resultado de la operacion: "+operando1+ operacion+operando2+ " es: "+ resultado);
    }
}
