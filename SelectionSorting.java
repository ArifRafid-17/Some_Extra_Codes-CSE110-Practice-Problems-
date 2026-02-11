import java.util.Scanner;
import java.util.Arrays;
public class SelectionSorting{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("N= ");
    int N= sc.nextInt();
    int [] arr = new int[N];
    for(int i=0; i<N; i++){
      System.out.print("Enter a number: ");
      int num= sc.nextInt();
      arr[i]=num;
    }
    System.out.println("Original Array: ");
    System.out.println(Arrays.toString(arr));
    for(int i=0; i<arr.length-1; i++){
      int min_index=i;
      for(int j=i+1; j<arr.length; j++){
        if(arr[j]<arr[min_index]){
          min_index=j;
        }
      }
      int temp=arr[min_index];
      arr[min_index]=arr[i];
      arr[i]=temp;
    }
    System.out.println("Sorted Array:");
    System.out.println(Arrays.toString(arr));
  }
}