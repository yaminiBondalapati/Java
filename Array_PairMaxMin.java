import java.util.*;

public class Array_PairMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of containers:");
        int n = sc.nextInt();

        int[] arr = new int[n];
      
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Pairs of max and min elements:");
        for (int i = 0; i < n / 2; i++) {
            System.out.println(arr[n - 1 - i] + " " + arr[i]);
        }

        if (n % 2 != 0) {
            System.out.println("Unpaired element: " + arr[n / 2]);
        }

        sc.close();
    }
}