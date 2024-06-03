import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
   
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


    



