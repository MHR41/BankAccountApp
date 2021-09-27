
package bankaccountapplication;

import java.util.ArrayList;

public class BankAccountApplication {

 
    public static void main(String[] args) {
        
        ArrayList<Account> list = new ArrayList<Account>();
        ArrayList<String[]> AccountHolders = new ArrayList<String[]>();
        
        FILE file = new FILE();
        
        
        AccountHolders = file.read();
        
        for(String[] accountHolder : AccountHolders){
        
            
            String name =accountHolder[0];
            String sSN = accountHolder[1];
            String accountType= accountHolder[2];
            double deposit = Double.parseDouble(accountHolder[3]);
            
            if(accountType.equals("Checking")){
            
                list.add(new Checking(name,sSN,deposit));
            }
            if(accountType.equals("Saving")){
            
                list.add(new Saving(name,sSN,deposit));
            }
            
        }
        
        for(Account account:list){
        
            account.showInfo();
            System.out.println("*************************");
        }
        
    }
    
}
