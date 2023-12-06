import java.util.Arrays;

public class AddTwoNumber {


    public static void removeDuplicates(int[] nums) {

        int count  = 0;
         for (int i = 0; i<nums.length; i++){
             if (i< nums.length-1 && nums[i] == nums[i+1]){
                 continue;
             }
             nums[count] = nums[i];
             count++;
         }
        System.out.println(count);

    }

    public static void main(String[] args) {
         int[] arr = {1 , 1, 2};
          removeDuplicates(arr);
    }
}
