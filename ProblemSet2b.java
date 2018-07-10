import java.util.Scanner;
public class ProblemSet2b
{
  public static void main(String[] args)
 {
    
    Scanner KB = new Scanner(System.in);
        
    System.out.println("Amount due in $?");
    int amountd = KB.nextInt();
 
    System.out.println("Amount received in $?");
    int amountr = KB.nextInt();
 
    int difference = (amountr - amountd);
     
    int balance = difference;
         
    int dll = balance / 100;
    balance = (balance - (100 * dll));
 
    int quarter = balance / 25;
    balance = (balance - (25 * quarter));
 
    int dime = balance / 10;
    balance = (balance - (10 * dime));
 
    int nickel = balance / 5;
    balance = (balance - (5 * nickel));
     
    int pennie = balance / 1;
    balance = balance - (1 * pennie);
 
    System.out.println("You need to give back " + dll + " dollar " + quarter + " quarter " + dime + " dime " + nickel + " nickel " + pennie + " pennie");
 
         
 }
}