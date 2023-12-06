public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
         for (int i = 0; i< nums.length-1; ++i){
             if ((nums[i] <= target && nums[i+1] >= target) ) {
                 return i + 1;
             }else if (nums[i] > target){
                 return i;
             }
         }
        return nums.length;
    }
    public static void main(String[] args) {
        int[] arr = {1};

        System.out.println(searchInsert(arr, 0));
    }
}
