package models;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Número: " + this.getNumero());
        System.out.println("Saldo: " + this.getSaldo());
    }
}
