package adaptor;

public interface BankApi {
    double checkBalance();
    boolean credit(double amount);
    boolean send(long toAccountNumber, double amount);
}
