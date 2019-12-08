package atmSample;

public class Account {

    private int accountNumber = 11;  //Account to be used in the project
    private int pinNumber =11; //Pin number to be used
    private double currentBalance = 0;  //the balance is curently set to zero, the muser must make a deposit to perforn transactions
    

    public Account() { 
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }
    

    @Override
    public String toString() {
        return "Account "
                + "" + "accountNumber  :" +
                getAccountNumber() + ", pinNumber" +
                getPinNumber() + ", currentBalance :"
                + "" + getCurrentBalance() + '}';
    }

    
    
    
}
    