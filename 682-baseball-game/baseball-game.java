class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack();
        for(String s:operations){
            if(s.equals("+")){
               int top=stack.pop();
               int newtop=top+stack.peek();
               stack.push(top);
               stack.push(newtop); 
            }else if(s.equals("D")){
                int top=stack.peek();
                int newtop=top*2;
                stack.push(newtop);
            }else if(s.equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.valueOf(s));
            }
        }
        int ans=0;
        for(int n:stack){
            ans+=n;
        }
        return ans;
    }
}