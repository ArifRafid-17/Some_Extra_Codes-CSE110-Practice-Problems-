import java.util.Scanner;
public class LabQuiz04{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int [] arr= new int [11];
    int num;
    int count=0;
    for(int i=0; i<11; i++){
      num = sc.nextInt();
      arr[i]=num;
      count++;
      if(count<3){
        System.out.println("Minimum 3 finish times required to show rankings");
        
      }
      
      for(int j=0;j<arr.length-1; j++){
        for(int k=0; k<arr.length-j-1; k++){
          if(arr[k]>arr[k+1]){
            int temp= arr[k+1];
            arr[k+1]=arr[k];
            arr[k]=temp;
          }
        }
      }
     if(num==-1){
       System.out.print("Final Fastest 3: ");
       for(int y=0; y<3; y++){
         System.out.print(arr[y]+" ");
       }
       break;
     }
    
     System.out.print("Current Fastest 3: ");
     for(int x=0;x<3;x++){
       System.out.print(arr[x]+" " );
     }
    }
  }
}