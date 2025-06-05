class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> numbers=new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(digits[k]%2==0 && i!=j && k!= i && k!= j && digits[i]!=0){
                        int number=digits[i]*100 +digits[j]*10 + digits[k];
                        numbers.add(number);
                    }
                }
            }
        }
        return numbers.size();
    }
}