public class ContaTerminal {
    int numeroConta;
    String agencia;
    String nomeCliente;
    float saldo;

    public ContaTerminal(String agencia, int numeroConta, String nomeCliente, float saldo) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
}
