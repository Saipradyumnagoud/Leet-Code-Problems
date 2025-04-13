class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new TreeMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        List<String> ans=new ArrayList<>(map.keySet());
        // for(Map.Entry<String,Integer> entry: map.entrySet()){
        //     if(entry.getValue()==k){
        //         ans.add(entry.getKey());
        //     }
        // }

        ans.sort((a,b)->{
            int feqcompare=map.get(b)-map.get(a);
            if(feqcompare==0){
                return a.compareTo(b);
            }
            return feqcompare;
        });

        return ans.subList(0,k);
    }
}