import java.util.*;
public class Adam_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int reverse = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        int squareNum = num * num;
        int reverseSquare = reverse * reverse;

        int reverseSquareNum = 0;
        temp = reverseSquare;
        while (temp != 0) {
            int digit = temp % 10;
            reverseSquareNum = reverseSquareNum * 10 + digit;
            temp /= 10;
        }

        if (squareNum == reverseSquareNum) {
            System.out.println(num + " is an Adam number");
        } else {
            System.out.println(num + " is not an Adam number");
        }

        sc.close();
    }
}