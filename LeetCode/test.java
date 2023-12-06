import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = { 1 , 2 , 3 , 0 ,  0 , 0 };
        int[] arr2 = { 0};

        int len1 = arr1.length;
        int len2 = arr2.length;
        int t_len  = len1 + len2;
        int[] arr3 =  new int[t_len];


        for (int i = 0 , k = 0; i<len1; i++){
            if (arr1[i] !=0){
                arr3[k] = arr1[i];
                k++;
            }
        }

        for (int i = 0 , k = 0; i<len2; i++){
            if (arr1[i] !=0){
                arr3[len1+i] = arr2[i];
                k++;
            }

        }




        for (int i = 0; i<t_len; i++){
            System.out.println(arr3[i]);
        }
    }
}
