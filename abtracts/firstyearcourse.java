package abtracts; 
import java.util.Scanner;
abstract class firstyearcourse {
    int totalweeks;
    abstract void printName();
    abstract void printCode();
   void printTotalWeeks(){
    Scanner s =new Scanner(System.in);

    System.out.println("enter total numbers of week in firstyear ");
    totalweeks= s.nextInt();
    System.out.println("total weeks in first year"+totalweeks);
    
   }
    
}
