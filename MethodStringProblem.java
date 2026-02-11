import java.util.Scanner;
public class MethodStringProblem{
  public static void function_name(String a){
    
//functioncdi

    int UpperCaseCount=0;
    int LowerCaseCount=0;
    
    
    for(int i=0; i<a.length(); i++){
      char c1=a.charAt(i);
      int ascii=(int)c1;
      
      
     /* if(ascii>=(int)'A' && ascii<=(int)'Z'){
        UpperCaseCount++;
      }
      else if(ascii>=(int)'a' && ascii<=(int)'z'){
        LowerCaseCount++;
      }*/
      
      
      if(c1>='A' && ascii<='Z'){
        UpperCaseCount++;
      }
      else if(ascii>='a' && ascii<='z'){
        LowerCaseCount++;
      }
      
    }
    System.out.print("No of Uppercase Characters: "+UpperCaseCount);
    System.out.println();
    System.out.print("No of Lowercase Characters: "+ LowerCaseCount);
  }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your words: ");
    String words = sc.nextLine();
    function_name(words);
  }
}
