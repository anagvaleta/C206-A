package org.example;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.setNome("Ana");
        c1.setCpf(123456);

        Cliente c2 = new Cliente();
        c1.setNome("Joao");
        c1.setCpf(123456);

        Cliente[] clientes = new Cliente[2];
        clientes[0] = c1;
        clientes[1] = c2;

        Conta conta = new Conta();
        conta.setClientes(clientes);
        conta.setLimite(500);
        conta.setSaldo(1234);

        System.out.println("O saldo inicial é: " + conta.getSaldo());

        conta.sacar(500);
        System.out.println("O saldo após o saque é: " + conta.getSaldo());
        conta.deposita(300);
        System.out.println("O saldo após o depósito é: " + conta.getSaldo());
    }
}