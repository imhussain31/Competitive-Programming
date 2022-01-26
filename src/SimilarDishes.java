import java.util.Scanner;

public class SimilarDishes {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();

            while (t--!=0){

                String[] str1 = new String[4];
                String[] str2 = new String[4];

                for (int i = 0; i<4; i++){
                    str1[i] = sc.next();
                }
                for (int i = 0; i<4; i++){
                     str2[i] = sc.next();
                }
                int cnt =0;
                for (int i = 0; i<4; i++){
                    for (int j = 0; j<4; j++){
                        if (str1[i].contains(str2[j])){
                            cnt++;
                        }
                    }
                }
                if (cnt >= 2){
                    System.out.println("similar");
                }else{
                    System.out.println("dissimilar");
                }

            }
        }
    }
}
