import java.util.Scanner;
public class BmiProject 
{
  public static void main (String [] args)
  {
  Scanner sc  = new Scanner(System.in);
  System.out.println("Enter your height(m) :");
  double height = sc.nextDouble();
  
  Scanner wc  = new Scanner(System.in);
  System.out.println("Enter your weight(kg) :");
  double weight = wc.nextDouble();
  
  double bmi = weight / (height * height); 
  
  System.out.println("Your BMI is "+ bmi );
  
  if(bmi<18.5)
  {
    System.out.println ("Status: You are Underweight");
    
  
  }
  else if(bmi>18.5 && bmi< 24.9)
  {
  System.out.println("Congratulations! You are healthy");
  }
  else if(bmi>25 && bmi<29.9)
  {
  System.out.println("You are overweight");
  System.out.println("Asap gym e jao"); 
  
  }
  else 
  {
  System.out.println("Obesity");
  System.out.println("Gym e giye dourao ar fat burn koro!");
  }
  }

}