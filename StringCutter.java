import java.util.Scanner;
public class StringCutter{
  public static void main(String [] args){
    System.out.println("--------Welcome--To---String----Cutter-----");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter string: ");
    String words = sc.nextLine();
    
    System.out.print("Enter number of characters: ");
    int num =sc.nextInt();
    
    if(num>words.length()){
      System.out.println("Number of characters cannot be larger than the String");
    }
    else{
    
    System.out.print("From the back? (true/false)");
    boolean BackFront =sc.nextBoolean();
    
    
    String FinalString="";
    
    if(BackFront==false){

      for(int i=num; i<words.length(); i++){
         char c1 = words.charAt(i);
         FinalString+=c1;
      }
      System.out.println(FinalString);
    }
    else{
      
      for(int i=0; i<words.length()-num; i++){
         char c2 = words.charAt(i);
         FinalString+=c2;
      }
      System.out.println(FinalString);
    }
   
  }
}
}