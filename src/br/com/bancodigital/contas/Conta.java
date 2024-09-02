package br.com.bancodigital.contas;

import br.com.bancodigital.cliente.Cliente;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contadestino) {
        sacar(valor);
        contadestino.depositar(valor);
    }

    protected void imprimirDadosBancarios(){
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Número: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
    
    public int getAgencia(){
        return agencia;
    }

    public double getSaldo(){
        return saldo;
    }
    public int getNumero(){
        return numero;
    }

    
}
