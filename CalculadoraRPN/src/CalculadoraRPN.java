public class CalculadoraRPN {

    public static double calcular(String expressaoRPN) {

        Pilha<Double> pilha = new Pilha<>();

        String[] elementos = expressaoRPN.split(" ");

        for (String elemento : elementos) {

            if (ehNumero(elemento)) {

                pilha.empilhar(Double.parseDouble(elemento));

            } else {

                double numero2 = pilha.desempilhar();
                double numero1 = pilha.desempilhar();

                double resultado = 0;

                switch (elemento) {

                    case "+":
                        resultado = numero1 + numero2;
                        break;

                    case "-":
                        resultado = numero1 - numero2;
                        break;

                    case "*":
                        resultado = numero1 * numero2;
                        break;

                    case "/":
                        resultado = numero1 / numero2;
                        break;
                }

                pilha.empilhar(resultado);
            }
        }

        return pilha.desempilhar();
    }

    private static boolean ehNumero(String texto) {

        try {
            Double.parseDouble(texto);
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}