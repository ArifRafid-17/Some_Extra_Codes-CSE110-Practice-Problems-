import java.util.Scanner;

public class MS1Problem01_GPT_polished {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the length of array: ");
        int length = sc.nextInt();

        int [] arr = new int[length];

        System.out.println("Please enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Please enter the target value: ");
        int targetValue = sc.nextInt();

        boolean found = false;

        for (int j = 0; j < length; j++) {
            for (int x = j + 1; x < length; x++) {

                if (arr[j] + arr[x] == targetValue) {
                    System.out.println("Elements need to be added: " + arr[j] + "  " + arr[x]);
                    System.out.println("Index of the elements: " + j + " and " + x);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("Target value not found");
        }
    }
}
