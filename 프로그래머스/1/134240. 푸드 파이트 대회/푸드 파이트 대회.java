class Solution {
    public String solution(int[] food) {
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < food.length; i++){
            for(int j = 0; j < food[i] / 2; j++)
                sb.append(i);
        }
        return sb.toString() + "0" + sb.reverse().toString();
    }
}