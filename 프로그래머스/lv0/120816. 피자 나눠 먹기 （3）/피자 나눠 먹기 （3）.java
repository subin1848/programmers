class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if (n>=1 && n <= 100 && slice >=2 && slice <= 10) {
            if (n%slice > 0) {
                answer = n/slice + 1;
            }
            else {
                answer = n/slice;
            }
        }
        

        return answer;
    }
}