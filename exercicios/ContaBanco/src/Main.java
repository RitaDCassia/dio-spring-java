import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        String entradaAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int entradaNumeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        String entradaNome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo de sua conta: ");
        float entradaSaldo = scanner.nextFloat();
        scanner.nextLine();

        ContaTerminal contaTerminal = new ContaTerminal(entradaAgencia, entradaNumeroConta, entradaNome, entradaSaldo);


        System.out.println("Olá " + entradaNome + ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                entradaAgencia + ", conta " + entradaNumeroConta + " e seu saldo de R$ " + entradaSaldo +
                " já está disponível para saque.");

        scanner.close();
    }
}
