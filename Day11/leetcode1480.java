class Solution {
    public int[] runningSum(int[] nums) {

        for(int i=1;i<nums.length;i++){
            if(i==nums.length-1){
                nums[i]=nums[i]+nums[i-1];
            }else{
            nums[i]=nums[i]+nums[i-1];
        }
        }
        return nums;
    }
}