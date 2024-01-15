class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        
        int i=1;
        int si=0;
        while(si<n-1 || i<n){
            if(arr[si]==arr[i]){
                
                return si+1;
            }else if(i==n-1){
                
                i=++si+1;
            }else{
                i++;
            }
            
        }
        return -1;
        // Your code here
    }
}