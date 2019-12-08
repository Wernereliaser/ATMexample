
package atmSample;

public class Withdraw  extends Account{   
    private double withdrawAmount;

    public Withdraw(int accountNumber, int pinNumber, double currentBalance) {
 
    }
    public Withdraw(){
        
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    public double Amount(){
   return this.getCurrentBalance() - this.withdrawAmount;
    }

    @Override
    public String toString() {
        return "Withdraw"
                + "" + "withdrawAmount"
                + withdrawAmount + '}';
    }
    
    
}
