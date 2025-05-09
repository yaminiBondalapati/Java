import java.util.*;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        
        if(num < 12 || num >= 100) {
            System.out.println("invalid");
        }
        else {
            if(num < 20) {
                System.out.println("less than 20");
            
                if(num % 2 == 0) {
                    System.out.println("even");
                }
                else {
                    System.out.println("odd");
                }
            }
            else {
                System.out.println("greater than 20");
            }
        }

        sc.close();
    }
}
