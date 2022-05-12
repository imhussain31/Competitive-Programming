import java.util.Arrays;
import java.util.Scanner;

public class ChefJudgesACompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- != 0) {
                int n = sc.nextInt();
                int[] alice = new int[n];
                int[] bob = new int[n];
                int sumAlice = 0, sumBob = 0;
                for (int i = 0; i < alice.length; i++) {
                    alice[i] = sc.nextInt();
                }

                Arrays.sort(alice);
                alice[n - 1] = 0;
                for (int i = 0; i < alice.length; i++) {
                    sumAlice += alice[i];
                }

                for (int i = 0; i < bob.length; i++) {
                    bob[i] = sc.nextInt();
                }

                Arrays.sort(bob);
                bob[n - 1] = 0;
                for (int i = 0; i < bob.length; i++) {
                    sumBob += bob[i];
                }

                if (sumAlice > sumBob) {
                    System.out.println("Bob");
                } else if (sumAlice < sumBob) {
                    System.out.println("Alice");
                } else {
                    System.out.println("Draw");
                }

            }
        }
    }
}