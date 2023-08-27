import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //TODO: Exibir a mensagem para o usuario solicitando os dados.
        System.out.println("Informe seu nome Completo");
        //TODO: Obter atraves do scanner os valores digitados no terminal.
        String nomeCompleto = scanner.nextLine();

        System.out.println("Informe sua agencia");
        String agencia = scanner.next();

        System.out.println("Informe o numero da conta");
        int numero = scanner.nextInt();

        System.out.println("Informe sua saldo");
        double saldo = scanner.nextDouble();

        //TODO: Exibir a mensagem conta criada.
        System.out.println("\"Olá "+nomeCompleto+" , obrigado por criar uma conta em nosso banco, sua agência " +
                "é "+ agencia +", conta "+ numero +" e seu saldo "+saldo+" já está disponível para saque\".");
    }
}