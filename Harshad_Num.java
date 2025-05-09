import java.util.*;
public class Harshad_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt(); 

        int sum = 0;
        int temp = num; 

        
        while (temp != 0) {
            sum += temp % 10; 
            temp /= 10;       
        }

      
        if (num % sum == 0) {
            System.out.println(num + " is a Harshad number");
        } else {
            System.out.println(num + " is not a Harshad number");
        }

        sc.close(); 
    }
}