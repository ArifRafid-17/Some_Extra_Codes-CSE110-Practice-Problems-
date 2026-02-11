import java.util.Scanner; 
  public class leap_year_checker 
  {
    public static void main (String [] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your year:");
    int num= sc.nextInt();
    
    if (num%4==0 && num%100!=0 || num%400==0){
    System.out.println ("This is a Leap Year");
    }
    else {
    System.out.println("This is not a leap year");
    } 
   }
  }