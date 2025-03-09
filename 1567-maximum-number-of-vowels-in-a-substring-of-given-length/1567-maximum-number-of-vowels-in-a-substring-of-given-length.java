class Solution {
    public int maxVowels(String s, int k) {
        // int count = 0;
        // int maxcount=0;
        // for(int i=0;i<=s.length()-k;i++){
        //     for(int j=i;j<i+k;j++){
        //         if ("aeiou".indexOf(s.charAt(j)) != -1) {
        //             count++;
        //         }
        //         maxcount=Math.max(maxcount,count);
        //     }
        //     count=0;
        // }
        // return maxcount;
        int vowels = 0;
        int consonants = 0;
        String vowelsStr = "aeiou";
        int max = 0;
        for(int i = 0; i < k; i++) {
            if(vowelsStr.contains(s.charAt(i) + "")) vowels++;
            else consonants++;
        }
        max = Math.max(vowels, max);
        for(int i = k; i < s.length(); i++) {
            if(vowelsStr.contains(s.charAt(i - k) + "")) vowels--;
            else consonants--;

            if(vowelsStr.contains(s.charAt(i) + "")) vowels++;
            else consonants++;
            
            max = Math.max(max, vowels);
        }
        return max;
    }
}