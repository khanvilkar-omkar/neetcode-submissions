class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    int[] result = new int[temperatures.length];
        Stack<Integer> tempday = new Stack<>();
        for(int i=temperatures.length-1;i>=0;i--){
            while(!tempday.isEmpty() && temperatures[i] >= temperatures[tempday.peek()]){
                tempday.pop();
            }
            if(!tempday.isEmpty()){
                result[i] = tempday.peek() - i;
            }
            tempday.push(i);
        }
        return result;
    }
}
