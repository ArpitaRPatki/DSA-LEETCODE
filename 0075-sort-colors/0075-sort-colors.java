class Solution {
    public void sortColors(int[] nums) {

        int mid = 0;
        int low = 0 ;
        int high = nums.length-1;

        for(int i =0 ; i< nums.length ; i++){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low]=0;
                nums[mid]=temp;
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp = nums[high];
                nums[high]=2;
                nums[mid]=temp;
                high--;

            }
            
        }
        
    }
}