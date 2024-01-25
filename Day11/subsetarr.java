class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        Arrays.sort(a1);
        Arrays.sort(a2);
         int count=0;
         for(int i=0;i<a1.length;i++){
             if(a2[count]==a1[i]){
                 count++;
             }
             if(count==a2.length){
                 return "Yes";
             }
         }
        
        return "No";
    }
}