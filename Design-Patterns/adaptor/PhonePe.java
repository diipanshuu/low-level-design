package adaptor;

public class PhonePe {
    static long accountNumber = 22399724329L;
    public static void main(String[] args) {
        BankApi bankApi = new YesBankAdaptor(accountNumber);
        System.out.println("Checking balance of our account: " + bankApi.checkBalance() );
        System.out.println("Adding funds to our account: " + bankApi.credit(100.00) );
        System.out.println("Sending to another account: " + bankApi.send(12345678999L, 100.00) );
    }
}
