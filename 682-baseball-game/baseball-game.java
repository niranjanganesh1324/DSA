class Solution {
    public int calPoints(String[] operations) {
        int arr[]=new int[operations.length];
        int top=-1;
        for(String s:operations){
            if(s.equals("+")){
                arr[top+1]=arr[top-1]+arr[top];
                top++;
            }else if(s.equals("D")){
                arr[top+1]=arr[top]*2;
                top++;
            }else if(s.equals("C")){
                top--;
            }else{
                top++;
                arr[top]=Integer.parseInt(s);
            }
        }
        int ans=0;
        for(int i=0;i<=top;i++){
            ans+=arr[i];
        }
        return ans;
    }
}