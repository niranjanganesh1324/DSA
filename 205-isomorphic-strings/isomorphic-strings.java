class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int map1[]=new int[256];
        int map2[]=new int[256];
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(map1[a]!=0){
                if(map1[a]!=b){
                    return false;
                }
            }

            if(map2[b]!=0){
                if(map2[b]!=a){
                    return false;
                }
            }

            map1[a]=b;
            map2[b]=a;
        }
        return true;
    }
}