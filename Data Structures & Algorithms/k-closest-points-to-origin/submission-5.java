class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        int[][] coord = new int[k][2];      
            
        PriorityQueue<Point> maxHeap= new PriorityQueue<>((a,b)-> Integer.compare(b.distanceScore,a.distanceScore));

        for(int[]p: points){

        Point currentPoint = new Point(p[0],p[1]);

        maxHeap.offer(currentPoint);

        if(maxHeap.size() > k){
            maxHeap.poll();
        }

        }


         for (int i = 0; i < k; i++) {
            Point closest = maxHeap.poll(); 
            coord[i][0] = closest.x;      
            coord[i][1] = closest.y;       
        }

        return coord;



    }



}
class Point{
    int x;
    int y;
    int distanceScore;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
        this.distanceScore = (x*x) + (y*y);

    }
}