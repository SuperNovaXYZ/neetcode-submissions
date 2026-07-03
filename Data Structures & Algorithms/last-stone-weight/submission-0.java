class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int n: stones){
            maxHeap.offer(n);
        }

        while(maxHeap.size() >1){
            int first= maxHeap.poll();
            int second=maxHeap.poll();
            
            if(first != second){
               int leftOver= first-second;
               maxHeap.offer(leftOver);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}
