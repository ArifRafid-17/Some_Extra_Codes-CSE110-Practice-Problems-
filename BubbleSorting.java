public class BubbleSorting {
    public static void main(String [] args){
        int [] arr={8, -9, -7, -10, 100, 200, 380};
        for(int i=0; i<arr.length-1; i++){
            for(int j=0;j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Bubble sorting: ");
        for(int index=0; index<arr.length; index++){
            System.out.print(arr[index]+" ");
        }
    }
}
