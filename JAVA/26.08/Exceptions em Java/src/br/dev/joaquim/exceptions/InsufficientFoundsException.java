package br.dev.joaquim.exceptions;

/**
 * Exceção lançada quando uma operação de saque é solicitada e o saldo da conta é insuficiente.
 */
public class InsufficientFoundsException extends Exception {
    public InsufficientFoundsException(String message) {
        super(message);  

    }
}