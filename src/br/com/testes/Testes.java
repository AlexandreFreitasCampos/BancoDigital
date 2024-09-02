package br.com.testes;

import br.com.bancodigital.banco.Banco;
import br.com.bancodigital.cliente.Cliente;
import br.com.bancodigital.contas.Conta;
import br.com.bancodigital.contas.ContaCorrente;
import br.com.bancodigital.contas.ContaPoupanca;

public class Testes {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setEndereco("Avenida dos Músicos");
        banco.setNumero(312);
        System.out.println("Endereço da agência: " + banco.getEndereco() + ", número: " + banco.getNumero());

        Cliente cliente = new Cliente("José Luiz da Silva");
        cliente.imprimirCliente();

        Conta cc = new ContaCorrente();
        cc.depositar(100);
    
        Conta cp = new ContaPoupanca();
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
