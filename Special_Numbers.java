import java.util.*;
public class Special_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range (two numbers):");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Special numbers in the range:");
        for (int i = num1; i <= num2; i++) {
            int a = i / 10; 
            int b = i % 10; 
            int sum = (a + b) + (a * b); 
            if (sum == i) {
              System.out.println(i); 
            }
        }

        sc.close(); 
    }
}