package org.example;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    Cliente [] clientes = new Cliente[3];

    public void sacar (float quantia){
        if(saldo >= quantia){
            this.saldo -= quantia;
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public void deposita(float quantia){
        this.saldo += quantia;
    }

    //getter e setters
    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }
}
