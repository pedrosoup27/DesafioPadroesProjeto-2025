import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FonteDeDados fonte = new FonteDeDados();
        VisualizadorController controller = new VisualizadorController(fonte);

        System.out.println("Comandos: -1 = ligar somatório | -2 = ligar média | -3 = ligar desvio padrão");
        System.out.println(" -4 = desligar somatório | -5 = desligar média | -6 = desligar desvio padrão");
        System.out.println("Digite um número positivo para adicionar à fonte de dados.");
        System.out.println("Digite 0 para sair.");

        int input;
        while (true) {
            System.out.print("\n> Digite um comando ou valor: ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();

                if (input == 0) {
                    System.out.println("Saindo...");
                    break;
                } else if (input == -1 || input == -2 || input == -3) {
                    controller.ligarVisualizador(input);
                } else if (input == -4 || input == -5 || input == -6) {
                    controller.desligarVisualizador(input + 3);
                } else if (input > 0) {
                    try {
                        fonte.add(input);
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                    }
                } else {
                    System.out.println("Comando inválido.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Limpa o buffer de entrada
            }
        }
        scanner.close();
    }
}