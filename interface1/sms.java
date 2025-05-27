package interface1;
import java.util.Scanner;

public class sms implements messaging {
   public  String getMessage(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the message");
         return s.nextLine();


    }
    public String getRecipient(){
        Scanner s =new Scanner(System.in);
        System.out.println("enter phone number");
        String number = s.nextLine();
        if(number.matches("\\d{10}")){
            return number;

        }
        else{
            return "invalid phone number";
        }
        

    }
    public void print(){
        String message=getMessage();
        String recipient=getRecipient();
        System.out.println("sending sms to "+recipient);
        System.out.println("meaasge"+getMessage());
         
    }
    
    }



    

