import java.util.*;
public class NearestInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        System.out.println("Enter the divisor (m):");
        int m = sc.nextInt();

        int nearest = findNearestInteger(num, m);
        System.out.println("Nearest integer divisible by " + m + ": " + nearest);

        sc.close();
    }

    public static int findNearestInteger(int num, int m) {
        int lower = (num / m) * m; 
        int higher = lower + m;   

        
        if (num - lower < higher - num) {
            return lower;
        } else if (num - lower > higher - num) {
            return higher;
        } else {
            
            return higher;
        }
    }
}