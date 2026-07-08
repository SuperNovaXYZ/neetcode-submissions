class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)-> (Integer.compare(b,a)));

        int[] freq= new int[26];

        for(char task: tasks){

            freq[task-'A']++;
          
             }

        for(int count: freq){
            if (count>0){
                heap.offer(count);
            }
        }
        

        Queue<int[]> cooldown= new LinkedList<>();

        int time=0;

        while(!heap.isEmpty() || !cooldown.isEmpty()){
            time++;
            if(!cooldown.isEmpty() && cooldown.peek()[1] == time){
            heap.offer(cooldown.poll()[0]);
            }
      


            if(!heap.isEmpty()){
                int count= heap.poll();
                count--;
            

            if(count>0){
                cooldown.offer(new int[]{count,time+n+1});
            }}



        }

        return time;
    }
}
