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
        BankAccount conta = new BankAccount("Jailson Mendes", 123456789, 119.99);
        double balance = conta.getBalance();
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
                balance += amount;
            } else if (operation==2) {
                if (amount < 0) {
                    throw new IllegalArgumentException("O saque nao pode ser negativo");
                }
                if (balance < amount) {
                    throw new InsufficientFundsException(amount, balance);
                }
                balance -= amount;
            }
        } catch (IllegalArgumentException | InsufficientFundsException msg) {
            System.out.println(msg.getMessage());
        }
        finally{
            System.out.println("Saldo Atual da conta "+conta.getAccountNumber()+": "+balance);
            in.close();
        }
    }
}