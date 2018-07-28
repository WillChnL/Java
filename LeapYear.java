/* William Chan code to check if a year is leap*/
import java.util.Scanner;
public class LeapYear
{
   public static void main(String [] args )
         
   {
      Scanner KB = new Scanner(System.in);
      int year;
      boolean leapyear;
      
      System.out.println("Please type a year and press Enter");
      year = KB.nextInt();
      
      leapyear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
      
      if (leapyear)
        {
            System.out.println(year + " is a leap year");
        } 
      else
            System.out.println(year + " is not a leap year");
    }

}