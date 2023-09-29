import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numeroConta;
        String idAgencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US).useDelimiter("\n");

        // Exibir as mensagens para o nosso usuário
        // Recebe os dados digitados pelo usuário
        System.out.println("Por gentileza, digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite qual a sua Agência: ");
        idAgencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Qual o seu saldo? ");
        saldo = scanner.nextDouble();

        scanner.close();

        // Exibir a mensagem requisitada
        System.out.println("\n");
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + idAgencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
