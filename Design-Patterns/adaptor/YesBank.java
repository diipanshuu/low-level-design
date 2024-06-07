package adaptor;

public class YesBank {

    public double getBalance(long accountNumber){
        return 100.00;
    }

    public boolean deposit(long accountNumber, double amount){
        return true;
    }

    public boolean withdraw(long accountNumber, double amount){
        return true;
    }

    public boolean transfer(long fromAccountNumber, long toAccountNumber, double amount){
        return true;
    }

}
