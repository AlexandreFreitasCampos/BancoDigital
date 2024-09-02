package br.com.bancodigital.contas;

public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato de conta poupança ===");
        super.imprimirDadosBancarios();
    }

}


