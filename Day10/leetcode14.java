class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        int index=0;
        String n="";
        for(int i=0;i<strs.length;i++){
            String m=strs[i];
            if(m.equals(n)){
                return n;
            }else if(strs.length==1){
                return m;
            }
        }
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            if(min>=s.length()){
                min=s.length();
                index=i;

            }

        }
        int min1=Integer.MAX_VALUE;
        String str=strs[index];
        for(int i=0;i<strs.length;i++){
            if(i==index){
                continue;
            }else{
            String str1=strs[i];
            int count=0;
            int count2=0;
            while(count2<str.length()){
                if(str1.charAt(count)==str.charAt(count)){
                    count++;
                }
                count2++;
                
            }
            if(min1>=count){
                min1=count;
            }
        }
        
    }
    String new1="";
    for(int i=0;i<min1;i++){
        new1=new1+str.charAt(i);

    }
    return new1;
    }

}