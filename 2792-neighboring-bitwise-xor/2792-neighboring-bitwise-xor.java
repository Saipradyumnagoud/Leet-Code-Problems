class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int ans=derived[0];
        for(int i=1;i<derived.length;i++){
            ans^=derived[i];
        }
        if(ans==0){
            return true;
        }
        return false;
        
    }
}