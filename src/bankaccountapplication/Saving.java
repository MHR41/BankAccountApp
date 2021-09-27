
package bankaccountapplication;

public class Saving extends Account{
    
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
    
    
    public Saving(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1"+accountNumber;
        
        setSafetyDepositBoxID();
        rate = setRate();
    }
    
    public void setSafetyDepositBoxID(){
    
        this.safetyDepositBoxID = (int)(Math.random()*Math.pow(10, 3));
        this.safetyDepositBoxKey = (int)(Math.random()*Math.pow(10, 4));
    }
    
    @Override
     double setRate(){

        return getBaseRate()* -.25;
    }
    
    public void showInfo(){
    
        super.showInfo();
        System.out.println("Account Number:"+this.accountNumber);
        System.out.println("Your Saving Account Features:"+
                           "\nSafetyDepositBoxID:"+this.safetyDepositBoxID+
                           "\nSafetyDepositBoxKey"+this.safetyDepositBoxKey);
    }
    
}
