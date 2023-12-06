import java.util.Scanner;

public class SerejaandDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr  = new int[t];

        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sereja = 0;
        int dima  = 0;
        int key = 1;
        for (int i = 0; i<arr.length; i++){
            if (i%2 == 0){
                sereja+=arr[arr.length - key];
                key++;
            }else{
                dima+=arr[i];
            }
        }

        System.out.println(sereja+" "+dima);
    }
}
