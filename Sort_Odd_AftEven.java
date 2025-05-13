import java.util.*;

public class Sort_Odd_AftEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of players:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        Collections.sort(even);
        Collections.sort(odd);

        System.out.println("Sorted array with even numbers first and odd numbers later:");
        for (int num : even) {
            System.out.print(num + " ");
        }
        for (int num : odd) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
