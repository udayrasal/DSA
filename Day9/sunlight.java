class Solution {

    public static int longest(int arr[],int n)
    {
        int max=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(max<=arr[i]){
                count++;
                max=arr[i];
            }
        }
      return count;  
    }
}
