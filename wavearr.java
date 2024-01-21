class Solution {
    public static void convertToWave(int n, int[] a) {
       for(int i=0; i<n-1;i++){
           if(i%4==0){
               int temp=a[i];
               a[i]=a[i+1];
               a[i+1]=temp;
               
           }
            if(i%4==2){
               int temp=a[i];
               a[i]=a[i+1];
               a[i+1]=temp;
           }
       }
       
       
       // code here
    }
}