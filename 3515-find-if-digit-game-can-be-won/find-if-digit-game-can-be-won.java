class Solution {
    public boolean canAliceWin(int[] nums) {
        int singledigits=0;
        int doubledigits=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9){
                singledigits+=nums[i];
            }else{
                doubledigits+=nums[i];
            }
        }
        if(singledigits==doubledigits){
            return false;
        }else{
            return true;
        }
    }
}