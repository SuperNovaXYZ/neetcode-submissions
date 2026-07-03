class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> temp = new Stack<>();

        for(int i=0;i<temperatures.length; i++){
            while (!temp.isEmpty() && temperatures[i] > temperatures[temp.peek()]){
                int curr = temp.pop();
                result[curr]=i-curr;

            }
            temp.push(i);
        }
        return result;
    }
}
