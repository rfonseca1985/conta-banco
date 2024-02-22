import java.util.Scanner;

/**
 * A classe App representa a aplicação principal que interage com a classe ContaTerminal,
 * solicitando informações ao usuário e exibindo uma mensagem de boas-vindas com os detalhes da conta.
 */
public class App {
    
    /**
     * Método principal que inicia a execução da aplicação.
     *
     * @param args Os argumentos de linha de comando (não utilizados neste caso).
     * @throws Exception Exceção genérica (não utilizada neste caso).
     */
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
