package interface1;
public class messeagingservice {




    public static void main(String[] args) {
        messaging s=new sms();
        s.printConnection();
        s.print();


        
    
     messaging e=new email();
     e.printConnection();
     e.print();
    }
}


