import java.util.*;
public class Distinct_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

   
        int distinctCount = 1; 
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) { 
                distinctCount++;
            }
        }

        System.out.println("Number of distinct elements: " + distinctCount);
    }
}