import java.util.*;
public class Array_Comparsion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }


        System.out.print("Enter the size of the second array: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr1[i];
        }
        for (int i = 0; i < m; i++) {
            sum2 += arr2[i];
        }

  
        if (n == m && sum1 == sum2) {
            System.out.println(" same");
        } else {
            System.out.println("Not same");
        }
    }
}