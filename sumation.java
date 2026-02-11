import java.util.Scanner;
public class sumation{
  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  int N=sc.nextInt();
  int sum=0;
  for(int i=1; i<=N;i++){
    if(i%3!=0){
    sum= sum+7;
    }
    else{
    sum=sum-7;
    }
  }
  System.out.println(sum);
  }
}