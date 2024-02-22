/**
 * A classe ContaTerminal representa uma conta em um terminal, contendo informações como número,
 * agência, nome do cliente e saldo.
 */
public class ContaTerminal {

    /**
     * Número da conta.
     */
    public int Numero;

    /**
     * Agência da conta.
     */
    public String Agencia;

    /**
     * Nome do cliente associado à conta.
     */
    public String NomeCliente;

    /**
     * Saldo atual da conta.
     */
    public double Saldo;

    /**
     * Construtor padrão da classe ContaTerminal.
     */
    public ContaTerminal(){

    }

    /**
     * Construtor parametrizado da classe ContaTerminal.
     *
     * @param Numero Número da conta.
     * @param Agencia Agência da conta.
     * @param NomeCliente Nome do cliente associado à conta.
     * @param Saldo Saldo atual da conta.
     */
    public ContaTerminal(int Numero, String Agencia, String NomeCliente, double Saldo) {
        this.Numero = Numero;
        this.Agencia = Agencia;
        this.NomeCliente = NomeCliente;
        this.Saldo = Saldo;
    }
}
