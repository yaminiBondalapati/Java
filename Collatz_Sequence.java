import java.util.*;
public class Collatz_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = sc.nextInt();

        int n = sc.nextInt();
         int i = 0;
         do{
             if(n % 2 == 0) {
                 System.out.print(n);
                 System.out.print("->");
                 n /= 2;
                
             }
             else {
                 System.out.print(n);
                 System.out.print("->");
                 n = 3*n + 1;
             }
             i++;
            
         }while(n != 1);
        
         System.out.println();
         System.out.println(i);


        sc.close(); 
    }
}