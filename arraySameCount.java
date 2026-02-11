import java.util.Arrays;
public class reverseorder{
  public static void main(String [] args){
    int [] arr={4,5,4,6,5};
    System.out.println("Array before editing: ");
    System.out.println(Arrays.toString(arr));
    
    int count=0;
    for(int i=0; i<arr.length; i++){

      for(int j=i+1; j<arr.length; j++){
        if(arr[i]==arr[j]){
          count++;
        }
      }
    }
      System.out.println("Total same count= "+count);
  }
}