class Solution {
    public String solution(int age) {
        char[] result = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        if (age == 0) return "a";
        
        char[] arr = new char[10];
        int index = 9; 

        while (age > 0) {
            int digit = age % 10;  
            arr[index--] = result[digit];
            age /= 10;
        }

        return new String(arr, index + 1, 10 - (index + 1));

    }
}