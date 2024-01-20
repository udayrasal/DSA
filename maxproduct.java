class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;
       int y=nums[i]*(nums[i-1])*(nums[i-2]);
       int z=nums[0]*nums[1]*nums[i];
       return Math.max(y,z);
        
    }
}