import models.Cliente;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;
import services.Banco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva");
        Cliente cliente2 = new Cliente("Maria Oliveira");

        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente2);

        Banco banco = new Banco();
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(1000);
        contaCorrente.imprimirExtrato();

        contaPoupanca.depositar(500);
        contaPoupanca.imprimirExtrato();

        contaCorrente.transferir(200, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        banco.listarContas();
    }
}
