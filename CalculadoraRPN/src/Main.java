import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora Infixa para RPN ===");
        System.out.print("Digite uma expressão matemática: ");

        String expressao = scanner.nextLine();

        System.out.println("Expressão digitada: " + expressao);

        scanner.close();
    }
}