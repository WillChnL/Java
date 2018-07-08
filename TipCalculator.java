import java.util.Scanner;
public class TipCalculator
{
   public static void main(String [] args )
         
   {
      Scanner KB = new Scanner(System.in);
      double totaldue;
      double tip;
      int serv;
      
      System.out.println("Please enter the amount of the receipt");
      totaldue = KB.nextDouble();
      
      System.out.println("Please enter satisfaction level of the services and press Enter");
      System.out.println("1 = Totally Satisfied");
      System.out.println("2 = Satisfied");
      System.out.println("3 = Dissatisfied");
      serv = KB.nextInt();
      
      if (serv == 1)
      {
         tip = totaldue * 0.2; 
      }  
      else if (serv == 2)
      {   
         tip = totaldue * 0.15;
      }     
      else
      {
         tip = totaldue * 0.10;
      }
      System.out.println("The satisfaction level is: " + serv + " and the tip is: $" + tip + " dollars");    
        
   }
}