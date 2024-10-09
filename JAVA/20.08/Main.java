import java.util.Scanner;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(double withdrawalAmount, double currentBalance) {
        super("Saldo insuficiente para saque. Tentativa de saque: " + withdrawalAmount + 
              ", Saldo atual: " + currentBalance);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankAccount conta = new BankAccount("Esfare Lado", 32587918, 1319.99);
        System.out.println("Escolha a operacao: ");
        System.out.println("1-Deposito \n2-Saque");
        int operation = in.nextInt();
        
        System.out.println("Digite o valor de deposito: ");
        double amount = in.nextDouble();

        try {
            if (operation==1) {
                if (amount < 0) {
                    throw new IllegalArgumentException("O deposito nao pode ser negativo");
                }
                conta.setBalance(conta.getBalance() +amount);
            } else if (operation==2) {
                if (amount < 0) {
                    throw new IllegalArgumentException("O saque nao pode ser negativo");
                }
                if (conta.getBalance() < amount) {
                    throw new InsufficientFundsException(amount, conta.getBalance());
                }
                conta.setBalance(conta.getBalance() -amount);
                
            }
        } catch (IllegalArgumentException | InsufficientFundsException msg) {
            System.out.println(msg.getMessage());
        }
        finally{
            System.out.println("Saldo Atual da conta "+conta.getAccountNumber()+": "+conta.getBalance());
            in.close();
        }
    }
}