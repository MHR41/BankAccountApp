
package bankaccountapplication;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.objects.NativeString.split;

public class FILE {

    ArrayList<String[]> txt = new ArrayList<String[]>();
    
    
    String line;
    String [] split;
    
    // you have to put the Accounts.csv file in your favaorite location and then give it's locatoin like following
    String fileNme="C:\\Users\\M.Hadi\\Downloads\\Accounts.csv"; 
    //
     public ArrayList<String[]> read(){
        
         
        try(BufferedReader read = new BufferedReader(new FileReader((fileNme)))){
            
            while((line=read.readLine())!= null){
            
                split = line.split(",");
                txt.add(split);
            }
            return txt;
        }
        catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
        
    
}
