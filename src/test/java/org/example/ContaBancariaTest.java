package org.example;

import org.example.ContaBancaria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    void deveDepositarValorPositivoComSucesso() {
    
        ContaBancaria conta = new ContaBancaria();
        double valorDeposito = 100.0;

        conta.depositar(valorDeposito);
        
        assertEquals(100.0, conta.getSaldo());
    }

    @Test
    void naoDevePermitirDepositoNegativoOuZero() {

        ContaBancaria conta = new ContaBancaria();
        double valorInvalido = 0.0;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            conta.depositar(valorInvalido);
        });
        assertEquals("O valor do depósito deve ser positivo.", exception.getMessage());
    }

    @Test
    void deveSacarValorDisponivelComSucesso() {

        ContaBancaria conta = new ContaBancaria();
        conta.depositar(200.0);
        double valorSaque = 50.0;

        conta.sacar(valorSaque);
        
        assertEquals(150.0, conta.getSaldo());
    }

    @Test
    void naoDevePermitirSaqueMaiorQueSaldo() {

        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100.0);
        double valorSaque = 150.0;


        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            conta.sacar(valorSaque);
        });
        assertEquals("Saldo insuficiente para saque.", exception.getMessage());
    }

    @Test
    void deveRealizarMultiplasOperacoesCorretamente() {

        ContaBancaria conta = new ContaBancaria();


        conta.depositar(500.0);
        conta.sacar(100.0);
        conta.depositar(50.0);
        conta.sacar(450.0);


        assertEquals(0.0, conta.getSaldo());
    }
}
