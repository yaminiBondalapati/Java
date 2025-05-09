import java.util.*;
public class Sum_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int sub = arr[1]; 
        System.out.print("Elements in the array: ");
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            sub = sub - arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
        System.out.println("Sum: " + sum); 
        System.out.println("Subtraction: " + sub); 
    }
}