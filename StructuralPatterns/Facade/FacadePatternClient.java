import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
public class FacadePatternClient {  
    private static int choice;  
    public static void main(String args[]) throws NumberFormatException, IOException {  
        do {       
            System.out.print("========= Mobile Shop ============ \n");  
            // Menu options and reading the user's choice
            ShopKeeper sk = new ShopKeeper();  
            // Switch case to handle the user's choice
            // ...
        } while (choice != 4);  
    }  
}