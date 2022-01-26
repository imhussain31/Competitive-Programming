import java.util.Scanner;

public class DevuAndFriendshipTesting {
    public static void main (String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        int[] deArr = new int[]{1 ,2 ,3 ,4 , 5, 6 ,7 ,6 ,5 ,4 ,3 ,2 ,1};
        while (t--!=0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            int first = deArr[0];
            int last = deArr[deArr.length-1];
            if (arr.length > deArr.length){
                for (int i = 0; i<arr.length; i++){
                        if (first == arr[i+1] || last == arr[arr.length-2]){
                            System.out.println("No");
                            break;
                        }else{
                            System.out.println("Yes");
                            break;
                        }
                    }
            }else{
                System.out.println("No");
            }
        }
    }
}
