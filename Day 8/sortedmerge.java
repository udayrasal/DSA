class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        int arr[]=new int[m+n];
        if(m!=0&&n!=0){
            
            while(i<m && j<n){
                if(nums1[i]<nums2[j]){
                    arr[k++]=nums1[i++];
                     
                }if(nums1[i]>=nums2[j]){
                    arr[k++]=nums2[j++];    
                }
               
            }while(j<n){
                arr[k++]=nums2[j++];
                
            }while(i<m){
                arr[k]=nums1[i];
                k++;
                i++;
            }
            
            for(int x=0;x<arr.length;x++){
                nums1[x]=arr[x];
            }
        }else{
            if(m==0){
                for(int x=0;x<arr.length;x++){
                    nums1[x]=nums2[x];
                }
            }
        }
    }
}