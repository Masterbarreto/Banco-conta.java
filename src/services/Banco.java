package services;

import models.Conta;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println("Conta número: " + conta.getNumero() + " | Titular: " + conta.getCliente().getNome());
        }
    }
}
