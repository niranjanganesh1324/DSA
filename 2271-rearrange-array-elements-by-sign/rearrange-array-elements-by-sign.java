class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int posindex=0;int negindex=1;
        int ans[]=new int[nums.length];
        for(int num:nums){
            if(num>0){
                ans[posindex]=num;
                posindex+=2;
            }else{
                ans[negindex]=num;
                negindex+=2;
            }
        }
        return ans;
    }
}