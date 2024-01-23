class Compute {
    public int findElement(int arr[], int n){
        int max=arr[0];
        int flag=0;
       // int s=n-1;
        int count=0;
        for (int i=1;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
                int s=i+1;
                while(s!=n){
                    if(arr[s]>=max){
                     //   count++;
                        flag=1;
                        }else{
                            flag=0;
                            break;
                        }
                    s++;
                }
                if(flag==1){
                    return arr[i];
                }
            }
        }
        return -1;
    }

}