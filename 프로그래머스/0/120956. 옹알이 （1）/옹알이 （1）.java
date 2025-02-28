class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] stringArray = { "aya", "ye", "woo", "ma" };
        
        for(int i = 0; i < babbling.length; i++) {
            String word = babbling[i];
            
            for(int j = 0; j < stringArray.length; j++) {
                word = word.replaceFirst(stringArray[j], String.valueOf(j));
            }
            
            boolean allDigits = true;
            for(int j = 0; j < word.length(); j++) {
                if(!Character.isDigit(word.charAt(j))) {
                    allDigits = false;
                    break;
                }
            }
            
            if(allDigits && !word.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}