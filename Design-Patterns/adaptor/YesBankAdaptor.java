package adaptor;

public class YesBankAdaptor implements BankApi{
    YesBank yesBank = new YesBank();
    private final long accountNumber;

    public YesBankAdaptor(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public double checkBalance() {
        return yesBank.getBalance(accountNumber);
    }

    @Override
    public boolean credit(double amount) {
        return yesBank.deposit(accountNumber, amount);
    }

    @Override
    public boolean send(long toAccountNumber, double amount) {
        return yesBank.transfer(accountNumber, toAccountNumber, amount);
    }
}
