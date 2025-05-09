import java.util.*;
public class Odd_Dig_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt(); 
        
        int countOddDigitNumbers = 0; 
        List<Integer> oddDigitNumbers = new ArrayList<>(); 
        for (int i = 1; i <= n; i++) {
            int digitCount = 0;
            int num = i;

       
            while (num != 0) {
                num /= 10;
                digitCount += 1; 
            }


            if (digitCount % 2 != 0) { 
                countOddDigitNumbers++;
                oddDigitNumbers.add(i); 
            }
        }


        System.out.println("Count of odd digit numbers: " + countOddDigitNumbers);

        System.out.println("Odd digit numbers:");
        for (int x : oddDigitNumbers) {
            System.out.print(x + " ");
        }
        System.out.println(); 

        sc.close(); 
    }
}