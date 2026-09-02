import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora Infixa para RPN ===");
        System.out.print("Digite uma expressão matemática: ");

        String expressao = scanner.nextLine();

        String rpn = ConversorRPN.converter(expressao);

        System.out.println("\nExpressão original:");
        System.out.println(expressao);

        System.out.println("\nExpressão em RPN:");
        System.out.println(rpn);

        scanner.close();
    }
}