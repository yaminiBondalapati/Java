import java.util.*;
public class Amstrong_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int arm_num = sc.nextInt();
        int number = arm_num;

        int n = String.valueOf(arm_num).length();
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, n);
            number /= 10;
        }

        if (arm_num == sum) {
            System.out.println("ARMSTRONG");
        } else {
            System.out.println("NOT ARMSTRONG");
        }

        sc.close();
    }
}