class Solution {
    public int findKthPositive(int[] arr, int k) {
        // int n=arr.length;
        // for(int i=0;i<arr[n-1];i++){
        //     for(int j=0;j<n;j++){
        //         if(arr[j]!=i){
        //             k--;
        //             if(k==0){
        //                 return i;
        //             }
        //         }
        //     }
        // }
        // return 0;
        HashSet<Integer> ans=new HashSet<>();
        for(int num : arr){
            ans.add(num);
        }

        int missingcount=0;
        int i=1;
        while(true){
            if(!ans.contains(i)){
                missingcount++;
                if(missingcount==k){
                    return i;
                }
            }
            i++;
        }
    }
}