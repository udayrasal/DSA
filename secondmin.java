class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
         long min=Long.MAX_VALUE;
                long smin=Long.MAX_VALUE;
                for(int i=0;i<a.length;i++){

                        if(a[i]<min){
                                smin=min;
                                min=a[i];
                        }

                }
                for(int i=0;i<a.length;i++){
                        if(a[i]==min)
                                continue;

                        if(a[i]<smin){

                                smin=a[i];
                        }
                }
                long arr[]=new long[]{-1,-1};
                if(min!=Long.MAX_VALUE && smin!= Long.MAX_VALUE){
                arr[0]=min;
                arr[1]=smin;
                return arr;
                }else{
                    return arr;
                }
    
    }
}
