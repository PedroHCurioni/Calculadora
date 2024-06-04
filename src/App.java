import java.util.Scanner;

public class App {

    private static double calcular(double num1, double num2, String operador) {
        switch (operador){                 
            case "+":
                return num1 + num2;
        default:
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = sc.next();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double resultado = calcular(num1, num2, operador);
        System.out.println("Resultado: " + resultado);
        
    }
}