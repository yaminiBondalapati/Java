import java.util.Scanner;

public class Array_Mheight_weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of persons:");
        int n = sc.nextInt();

        int[] data = new int[2 * n];
        System.out.println("Enter the heights and weights of the persons:");
        for (int i = 0; i < 2 * n; i++) {
            data[i] = sc.nextInt();
        }

        System.out.println("Heights with their respective indices:");
        for (int i = 0; i < 2 * n; i += 2) {
            System.out.println("Person " + ((i / 2) + 1) + ": Height = " + data[i]);
        }

        int maxHeight = Integer.MIN_VALUE;
        int maxWeight = Integer.MIN_VALUE;
        int maxHeightPerson = -1;
        int maxWeightPerson = -1;

        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) { 
                if (data[i] > maxHeight) {
                    maxHeight = data[i];
                    maxHeightPerson = (i / 2) + 1; 
                }
            } else { 
                if (data[i] > maxWeight) {
                    maxWeight = data[i];
                    maxWeightPerson = (i / 2) + 1; 
                }
            }
        }

        System.out.println("Person with max height: Person " + maxHeightPerson);
        System.out.println("Person with max weight: Person " + maxWeightPerson);

        sc.close();
    }
}