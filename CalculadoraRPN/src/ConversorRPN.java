public class ConversorRPN {

    public static String converter(String expressao) {

        Pilha<Character> pilha = new Pilha<>();
        StringBuilder saida = new StringBuilder();

        for (int i = 0; i < expressao.length(); i++) {

            char caractere = expressao.charAt(i);

            if (caractere == ' ') {
                continue;
            }

            if (Character.isDigit(caractere) || caractere == '.') {

                while (i < expressao.length()
                        && (Character.isDigit(expressao.charAt(i))
                        || expressao.charAt(i) == '.')) {

                    saida.append(expressao.charAt(i));
                    i++;
                }

                saida.append(" ");
                i--;

            } else if (caractere == '(') {

                pilha.empilhar(caractere);

            } else if (caractere == ')') {

                while (!pilha.estaVazia() && pilha.topo() != '(') {
                    saida.append(pilha.desempilhar()).append(" ");
                }

                pilha.desempilhar();

            } else if (ehOperador(caractere)) {

                while (!pilha.estaVazia()
                        && prioridade(pilha.topo()) >= prioridade(caractere)) {

                    saida.append(pilha.desempilhar()).append(" ");
                }

                pilha.empilhar(caractere);
            }
        }

        while (!pilha.estaVazia()) {
            saida.append(pilha.desempilhar()).append(" ");
        }

        return saida.toString().trim();
    }

    private static boolean ehOperador(char c) {
        return c == '+'
                || c == '-'
                || c == '*'
                || c == '/';
    }

    private static int prioridade(char operador) {

        if (operador == '+' || operador == '-') {
            return 1;
        }

        if (operador == '*' || operador == '/') {
            return 2;
        }

        return 0;
    }
}