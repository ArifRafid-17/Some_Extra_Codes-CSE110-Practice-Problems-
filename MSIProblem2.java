import java.util.Scanner;
public class MSIProblem2{
    public static void function_name(String a, int b){
        String FinalWords="";
        String temp="";
        for(int i=0; i<a.length(); i++){
            char c=a.charAt(i);
            if(i==0){
                FinalWords+=c;
            }
            else if(i%b==0 && i!=0){
                temp+=c;
                continue;   
            }
            else{
                 FinalWords+=c;
            }
        }
        FinalWords+=temp;
        System.out.println(FinalWords);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Sentence: ");
        String words = sc.nextLine();

        System.out.print("Enter the position: ");
        int position = sc.nextInt();

        function_name(words, position);
    }
}