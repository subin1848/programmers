class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];

        if (a < b + c && b < a + c && c < a + b) {
            return 1; // Valid triangle
        } else {
            return 2; // Not a valid triangle
        }
    }
}
