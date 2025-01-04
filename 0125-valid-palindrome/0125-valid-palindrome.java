class Solution {
    public boolean isPalindrome(String s) {
        // String reversed= new StringBuilder(s).reverse().toString();
        // int n=reversed.length();
        // for(int i=0;i<n;i++){
        //     if(s.charAt(i)!=reversed.charAt(i)){
        //         return false;
        //     }
        // }
        // return true;
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left=0,right=cleaned.length()-1;
        while(left<right){
            if(cleaned.charAt(left)!=cleaned.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}