public class Binary_Search {

    public void Binary_search (int arr[] ,  int target , int low , int high){
        int cnt = 0;


        while (low <= high){
            int mid = low+high/2;

            if (arr[mid] == target){
                System.out.println("Found");
                cnt++;
                break;
            }
            else if ( arr[mid] < target) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if (cnt == 0){
            System.out.println("Not found");
        }


    }

    public static void main (String[] args){
          Binary_Search ob = new Binary_Search();
          int arr[] = {3 , 4 , 5 , 6 , 7 , 8 , 9};
          int target = 2;
          int length = arr.length;
          ob.Binary_search(arr , target , 0 , length-1);

    }
}
