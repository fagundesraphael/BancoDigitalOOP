package org.example;

import org.example.demo.*;

public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Raphael");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(1000.0, (IConta) poupanca);

        ((ContaCorrente) cc).imprimirExtrato();
        ((ContaPoupanca) poupanca).imprimirExtrato();
    }
}