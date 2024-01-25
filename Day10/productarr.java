class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
	    long prod=1;
	    long prod1=1;
	    long[] nums1=new long[nums.length];
	    int count=0;
	    for(int i=0;i<nums.length;i++){
	        if(nums[i]==0){
	            count++;
	        }
	    }
	    if(count>=2){
	        return nums1;
	    }
	    
	    
	    for(int i=0;i<nums.length;i++){
	        
	        if(nums[i]!=0){
	            prod1=prod1*nums[i];
	            
	        }
	        prod=prod*nums[i];
	    }
	    for(int i=0;i<nums.length;i++){
	        if(nums[i]==0){
	            
	            nums1[i]=prod1;
	            
	        }
	        else{
	            nums1[i]=prod/nums[i];
	        }
	    }
	    return nums1;
        // code here
	} 
} 
