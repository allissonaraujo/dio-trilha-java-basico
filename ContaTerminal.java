import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor informe o número da sua conta  sem caracteres especiais: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Agora digite por favor o número da sua agência: ");
        String agencia = (String) scanner.next();

        System.out.print("Digite o seu nome completo: ");
        String nomeCliente = (String) scanner.next();

        System.out.print("Digite o seu Saldo Bancário: ");
        float saldo = (float) scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia +" , conta " +  numeroConta +  " e seu saldo " + saldo + " já está disponível para saque!");
    }
}
