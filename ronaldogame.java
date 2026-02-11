import java.util.Scanner;
public class ronaldogame{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a 4-digit number: ");
    int num=sc.nextInt();
    int primecount=1;
    int life=2;
    for(int i=1; i<=4;i++){
     int digit=num%10;
     if(digit==2 || digit==3|| digit==5|| digit==7){
       System.out.println(digit+" is prime!"+"("+primecount+"/3 found)");
       primecount++;
        if(primecount>3){
    System.out.println("Congratulations! You won the game!");
    break;
    }
     }
     else{
     System.out.println(digit+" is not prime. Lives left: "+life);
     life--;
     if(life<0){
     System.out.println("Gave over! You lost.");
     break;
     }
     }
     num=num/10;
    }
   
    }
  }