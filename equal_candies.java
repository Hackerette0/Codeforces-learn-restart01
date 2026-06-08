import java.io.*;
import java.util.*;

public class equal_candies {
    //suppose arraylist - 'arr' containing 'n' integers, input length can go till 10^7
    public static int solve(int[] arr, int n) {
        int min = Arrays.stream(arr).min().getAsInt();
        int sum = 0;

        for (int i = 0; i< arr.length; i++){
            int remaining = arr[i]-min;
            sum += remaining;
        }
        return sum;
    }
    
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int testCases = scanner.nextInt();

        // Loop through each testcase
        for (int t = 0; t < testCases; t++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            
            // Populate the array for this specific test case
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println(solve(arr, n)); 
        }

        scanner.close();
    
    }
}