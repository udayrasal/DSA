import java.util.Arrays;

class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        Arrays.sort(arr);
        int s=0;
        int e=n-1;
        while(s<e){
            if(arr[s]+arr[e]==x)
                return true;
            else if(arr[s]+arr[e]<x){
                s++;
            }
            else{
                e--;
            }
        }
        return false;
        // code here
    }
}