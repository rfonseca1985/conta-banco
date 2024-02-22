import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ContaTerminal ct = new ContaTerminal();

        System.out.println("Por favor, digite o número da Conta !");
        ct.Numero = sc.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        ct.Agencia = sc.next();
        System.out.println("Por favor, digite o nome do Cliente  !");
        ct.NomeCliente = sc.next();
        System.out.println("Por favor, digite seu Saldo !");
        ct.Saldo = sc.nextDouble();
        sc.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo: R$%.2f já está disponível para saque.",
                ct.NomeCliente, ct.Agencia, ct.Numero, ct.Saldo);
    }
}
