class Solution {
    public int largestRectangleArea(int[] heights) {
        
            Stack<Integer> stack = new Stack<>();
            int max=0;

         

            for(int i=0; i<heights.length; i++){



                while(!stack.isEmpty() && heights[i] < heights[stack.peek()]){
                  int height= heights[stack.pop()];
                  int width;
                  if(stack.isEmpty()){
                    width = i;
                  }else{
                  int left= stack.peek();
                  width= i-left-1;
                  }

                  int area = height * width;
                  max=Math.max(area,max);

                }  
                
                stack.push(i);

            }



            while (!stack.isEmpty()){
                int height= heights[stack.pop()];
                int width;

                if(stack.isEmpty()){
                    width = heights.length;
                }else{
                    int left= stack.peek();
                    width= heights.length-left-1 ;
                }

                int area= height * width;
                max=Math.max(area,max);
            }



            return max;
    }
}
