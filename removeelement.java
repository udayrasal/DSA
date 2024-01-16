class Solution {
    public int removeElement(int[] nums, int val) {
         int k=0;
                for(int i=0;i<nums.length;i++){
                        if(nums[i]!=val){
                                k++;
                        }
                }
                //int arr[]=new int[k];
                int count=0;
                for(int i=0;i<nums.length;i++){
                        if(nums[i]!=val){
                                nums[count]=nums[i];
                                count++;
                        }
                }
             
                return k;
        
    }
}