package interface1;
import java.util.Scanner;

public class email implements messaging{
   public  String getMessage(){
    Scanner s=new Scanner(System.in);
    System.err.println("enter input");
    return s.nextLine();


   }
   public String getRecipient(){

      Scanner s=new Scanner(System.in);
     System.out.println("enter email");
     return s.nextLine();
   }
   public void print(){
    System.out.println("your message is "+getMessage());
    System.out.println("your email"+getRecipient());
      


   }
   

    
    
}
