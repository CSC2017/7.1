
public class Sort {
    public static int findSmallest(int [] nums) {
        int smallest = nums[0];

        for(int i=1; i<nums.length; i++) {
            if(smallest>nums[i]) {
                smallest = nums[i];
            }
        }

        return smallest;
    }

    public static void sort(int [] nums) {
        int [] sortedList=null;
        //loop thru the size of the list
        for(int i=0; i<nums.length-1; i++) {
            //move the lowest value to the first of the list
            int small = nums[i];
            int idxSmall = i;
            for(int j=i+1; j<nums.length; j++) {
                if(small>nums[j]) {
                    small = nums[j];
                    idxSmall = j;
                }
            }
            swap(i,idxSmall,nums);
        }
    }

    private static void swap(int idxSmall, int j, int [] nums) {
        int temp = nums[idxSmall];
        nums[idxSmall] = nums[j];
        nums[j] = temp;
    }

}
