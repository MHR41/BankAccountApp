
package bankaccountapplication;

import java.util.Random;


public class Checking extends Account {
    
    private long debitCardNumber; 
    private int debitCardPIN;

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2"+ accountNumber;
        
        setDebitCardNumber();
        rate=setRate();
        
    }
    
    public void setDebitCardNumber(){
        
        this.debitCardNumber = (long)(Math.random()*Math.pow(10, 12));
        this.debitCardPIN = (int)(Math.random()*Math.pow(10, 4));
        
        
    }
    
    
    @Override
     double setRate(){
    
        return getBaseRate()* .15;
    }
    
    public void showInfo(){
    
        super.showInfo();
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Your Checking Account Features:"+
                           "\nDebit Card Number:"+this.debitCardNumber+
                           "\nDebit Card PIN:"+this.debitCardPIN);
        
    }
}
