import java.util.*;

public class Guessing
{
    public static void main(String[] args)
    {
       final int MAX = 10;
       int answer, guess;
       
       Scanner KB = new Scanner(System.in);
       Random generator = new Random();
       
       answer = generator.nextInt(MAX) + 1;
       
       System.out.print("I'm thinking of a number: ");
       System.out.println(answer); 
       
       guess = KB.nextInt();
       
       if (guess == answer)
          System.out.println("You got it!");
          
       else if (guess > answer)
          System.out.println("Your number is higher than the number");
          
       else 
          System.out.println("Your number is lower than the number");
    }
}