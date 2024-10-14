import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int n : stones) {
            pq.add(n);
        }
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            if(a!=b){
                pq.add(a-b);
            }
        }
        if(pq.isEmpty()) {
            return 0;
        }
        else{
            return pq.poll();
        }
    }
}