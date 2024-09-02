package br.dev.joaquim.bank;

import br.dev.joaquim.exceptions.InsufficientFoundsException;

/**
 * Representa uma conta bancária com funcionalidades básicas de depósito e saque.
 *
 * @author Joaquim (seu nome ou nome do desenvolvedor)
 */
public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    /**
     * Cria uma nova conta bancária com número, saldo e nome do titular especificados.
     *
     * @param accountNumber O número da conta.
     * @param balance O saldo inicial da conta.
     * @param accountHolderName O nome do titular da conta.
     */
    public BankAccount(int accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;  

    }

    /**
     * Obtém o número da conta.
     *
     * @return O número da conta.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Obtém o saldo atual da conta.
     *
     * @return O saldo da conta.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Obtém o nome do titular da conta.
     *
     * @return O nome do titular da conta.
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Deposita um valor na conta.
     *
     * @param value O valor a ser depositado.
     * @throws IllegalArgumentException Se o valor for negativo.
     */
    public void deposit(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("O valor precisa ser positivo, foi informado o valor R$ " + value);
        }
        this.balance += value;
    }

    /**
     * Saca um valor da conta.
     *
     * @param value O valor a ser sacado.
     * @throws IllegalArgumentException Se o valor for negativo.
     * @throws InsufficientFoundsException Se o saldo for insuficiente para o saque.
     */
    public void withdraw(double value) throws InsufficientFoundsException {
        if (value < 0) {
            throw new IllegalArgumentException("O valor precisa ser positivo, foi informado o valor R$ " + value);
        }
        if (value > this.balance) {
            throw new InsufficientFoundsException(
                    "Saldo insuficiente para saque. Valor solicitado: R$ " + value + 
                    ", Saldo disponível: R$ " + this.balance);
        }
        this.balance -= value;
    }

    /**
     * Retorna uma representação em string da conta bancária.
     *
     * @return Uma string contendo informações da conta.
     */
    @Override
    public String toString() {
        return "Conta " + accountNumber + " de " + accountHolderName + " têm R$ " + balance + " de saldo";
    }
}