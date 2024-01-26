class Solution {
    
    public pair indexes(long v[], long x)
    {
        int flag=0;
        int min=-1;
        int max=-1;
        for(int i=0;i<v.length;i++){
            if(v[i]==x&&flag==0){
                min=i;
                flag=1;
            }
            if(v[i]==x){
                max=i;
            }
        }
        pair p=new pair(min,max);
        return p;
        
        
        // Your code goes here
    }
}