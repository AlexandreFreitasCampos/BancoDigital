package br.com.bancodigital.contas;

public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato de conta corrente ===");
        super.imprimirDadosBancarios();
    }

}
