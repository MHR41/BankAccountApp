
package bankaccountapplication;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class Account implements IBaseRate {
    
    private String name;
    private String sSN;
    private double balance;
    
    protected double rate;
    String accountNumber;
    private static int index = 10000;
    
    public Account(String name,String sSN,double initDeposit){
    
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        
        this.accountNumber=setAccountNumber();
        
    }
    
    abstract double setRate();
    
    private String setAccountNumber(){
    
        Random random  = new Random();
        String lastTwoOfSSN = sSN.substring(sSN.length()-2,sSN.length());
        
        int uniqeID = index;
        index++;
        
        int digit3Number;
        do{
                digit3Number =random.nextInt(1000);
                if(digit3Number>100){
                    
                    break;
                }
            
        }while( true);
        
        return lastTwoOfSSN +uniqeID+digit3Number;
        
    }
    
    public void deposit(int amount){
    
        balance+=amount;
    }
    
    public void withdraw(int amount){
    
        balance-=amount;
    }
    
    public void transfer(String toWhere,int amount){
    
        try {
            
            balance-=amount;
            System.out.println("Transfering "+amount+"$"+" to "+toWhere+"...");
            Thread.sleep(2000);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public  void showInfo(){
    
        System.out.println("Name:"+this.name+
                            "\nSSN:"+this.sSN+
                            "\nRate:"+this.rate+
                            "\nBalance:"+this.balance);
    }

    public String getName() {
        return name;
    }

    public String getsSN() {
        return sSN;
    }

    public double getBalance() {
        return balance;
    }

    public double getRate() {
        return rate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public static int getIndex() {
        return index;
    }
    
    
}
