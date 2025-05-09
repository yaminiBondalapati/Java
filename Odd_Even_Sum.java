import java.util.*;
public class Odd_Even_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int input = sc.nextInt(); 

        int even_sum = 0; 
        int odd_sum = 0;  

        while (input != 0) {
            int r = input % 10; 
            if (r % 2 == 0) {
                even_sum += r; 
            } else {
                odd_sum += r; 
            }
            input /= 10; 
        }

        
        System.out.println("Sum of even digits: " + even_sum);
        System.out.println("Sum of odd digits: " + odd_sum);

        sc.close(); 
    }
}