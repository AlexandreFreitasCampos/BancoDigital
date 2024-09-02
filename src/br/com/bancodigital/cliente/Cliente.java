package br.com.bancodigital.cliente;

public class Cliente {
    public String nome;

    public Cliente(String nome){
        this.nome = nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirCliente(){
        System.out.println("Cliente: " + nome);
    }
}
