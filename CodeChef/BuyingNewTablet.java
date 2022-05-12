import java.util.Scanner;

public class BuyingNewTablet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int t = sc.nextInt();

            while (t-- != 0) {
                int N = sc.nextInt();
                int B = sc.nextInt();
                int cnt = 0, area = 0, max_area = 0;
                while (N-- != 0) {
                    int w = sc.nextInt();
                    int h = sc.nextInt();
                    int p = sc.nextInt();

                    if (B >= p) {
                        area = w * h;
                        if (area > max_area) {
                            max_area = area;
                        }
                        cnt++;
                    }
                }
                if (cnt > 0) {
                    System.out.println(max_area);
                } else {
                    System.out.println("no tablet");
                }
            }

        }
    }
}