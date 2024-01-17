class Solution {
    public int majorityElement(int[] nums) {
        
         int n=nums.length/2;
                int val=0;

                for(int i=0;i<nums.length;i++){
                        int temp=nums[i];
                        int z=i;
                         int count=0;

                        while(z>=1){
                                if(nums[z-1]==temp){
                                        break;
                                }
                                z--;
                        }
                        if(z==0){
                                for(int j=0;j<nums.length;j++){
                                        if(nums[i]==nums[j]){
                                                count++;
                                        }
                                }
                                if(count>n){
                                         val=nums[i];
                                }
                        }
                }
                return val;
    }
}