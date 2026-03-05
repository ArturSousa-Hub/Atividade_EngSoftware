package org.example;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para saque.");
        }
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser positivo.");
        }
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}