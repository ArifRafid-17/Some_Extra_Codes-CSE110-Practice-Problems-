import java.util.Scanner;
public class WayTooLongWords{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    while(true){
     int n=sc.nextInt();

     if(n>1 && n<=100){
    int count=0;
    for(int i=0; i<n; i++){
    Scanner wc = new Scanner(System.in);
    String words = wc.nextLine();
    char c1=words.charAt(0);
    char c2=words.charAt(words.length()-1);
    String s1=""+c1;
    String s2=""+c2;
    
    if(words.length()>=10){
    for(int J=1; J<words.length()-1; J++ ){
        count++;
      }
       System.out.println(s1+count+s2);
       count=0;
       
    }

    else{
      System.out.println(words);
    }

    }
   
  } 
}
    
}
}