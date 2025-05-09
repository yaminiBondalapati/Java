import java.util.*;
public class Trendy_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a three-digit number:");
        int t_num = sc.nextInt();


        if (t_num >= 100 && t_num <= 999) {
            t_num /= 10;
            int mid_num = t_num % 10; 
            if (mid_num % 3 == 0) {
                System.out.println("Trendy number");
            } else {
                System.out.println("Not a Trendy number");
            }
        } else {
            System.out.println("Invalid input: not a three-digit number");
        }

        sc.close();
    }
}