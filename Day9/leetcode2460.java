class Solution {
    public int[] applyOperations(int[] nums) {

        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
            continue;
            }else if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }       
        }
        int arr[]=new int[nums.length] ;
        int count=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               arr[count]=nums[i];
               count++;
           }
        }  
      return arr;  
    }
}