import java.util.Scanner;
public class clock{
  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the hours: ");
  int hour= sc.nextInt();
  
  System.out.println("Enter the minutes: ");
  int minutes = sc.nextInt();
   
  //smaller angle calculation
  double sum1= (hour*30)+(minutes*0.5);
  double sum2= minutes*6;
  double sumfinal= sum1-sum2;
  
  if(sumfinal>0){
  System.out.println("Smaller angle: "+ sumfinal);
  }
  else{
    sumfinal= -1*sumfinal;
    System.out.println("Smaller angel: "+ sumfinal); 
  }
  double sumfinal2= 360-sumfinal;
  System.out.println("Larger angle: "+sumfinal2);
  }
}