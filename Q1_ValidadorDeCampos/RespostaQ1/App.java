public class App {
    public static void main(String[] args) throws Exception {
        String email = "bernardo.copstein@pucrs.br";

        Validador validador = new Validador(new ValidacaoEmail());

        if (validador.valida(email)) {
            System.out.println(email + " é um email válido!");
        } else {
            System.out.println(email + " não é um email válido!");
        }

        // Podemos trocar a estratégia em tempo de execução:
        validador.setStrategy(new ValidacaoInteiro());
        System.out.println("12345 é inteiro válido? " + validador.valida("12345"));
    }
}
