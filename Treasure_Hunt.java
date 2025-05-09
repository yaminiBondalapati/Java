import java.util.*;
public class Treasure_Hunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of gold coins:");
        int gold_coins = sc.nextInt();

        System.out.println("Enter Ben's share percentage:");
        int ben_share = sc.nextInt();

        System.out.println("Enter BB's share percentage:");
        int bb_share = sc.nextInt();

        ben_share = ben_share * gold_coins / 100;
        gold_coins -= ben_share;


        bb_share = bb_share * gold_coins / 100;
        gold_coins -= bb_share;


        int other_per = gold_coins / 3;

        System.out.println("Ben's share: " + ben_share);
        System.out.println("BB's share: " + bb_share);
        System.out.println("Each other's share: " + other_per);

        sc.close();
    }
}
