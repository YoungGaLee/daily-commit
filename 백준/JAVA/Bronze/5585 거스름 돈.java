import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        int[] coins = {500, 100, 50, 10, 5, 1};

        int n = 1000 - price;
        int cnt = 0;

        for (int i : coins) {
            if (n / i != 0) {
                cnt += n / i;
                n %= i;
            }
        }
        System.out.println(cnt);
    }
}
