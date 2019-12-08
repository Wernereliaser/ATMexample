
package atmSample;

public class Deposit  extends Account{ 
    private double DepositAmount;
            

    public Deposit(int accountNumber, int pinNumber, double currentBalance) { 
       
    }
    public Deposit(){
        
    }

    public double getDepositAmount() {
        return DepositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.DepositAmount = depositAmount;
    }
    
  
        
    

    @Override
    public String toString() {
        return "Deposit " +
                "depositAmount "
                + "" + getDepositAmount() + '}';
    }
    
    
            
    
}
