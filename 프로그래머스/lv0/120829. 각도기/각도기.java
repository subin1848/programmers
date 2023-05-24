class Solution {
    public int solution(int angle) {
        if(angle > 0 & angle < 90) {
            int answer = 1;
            return answer;
        } else if(angle == 90) {
            int answer = 2;
            return answer;
        } else if(angle > 90 & angle < 180) {
            int answer = 3;
            return answer;
        } else {
            int answer = 4;
            return answer;
        }
            
    }
}