class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;

        // 문자열을 한 글자씩 String 배열에 담기
        String[] str = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            str[i] = String.valueOf(s.charAt(i));
        }

        String answer = "";
        
        // 모든 중심점을 기준으로 좌우 대칭 검사
        for (int center = 0; center < str.length; center++) {
            // 홀수 길이 팰린드롬 검사 (ex. aba)
            String odd = expandFromCenter(str, center, center);
            if (odd.length() > answer.length()) answer = odd;

            // 짝수 길이 팰린드롬 검사 (ex. abba)
            String even = expandFromCenter(str, center, center + 1);
            if (even.length() > answer.length()) answer = even;
        }

        return answer;
    }

    // 중심을 기준으로 좌우 대칭 문자열 추출
    private String expandFromCenter(String[] str, int left, int right) {
        StringBuilder sb = new StringBuilder();
        while (left >= 0 && right < str.length && str[left].equals(str[right])) {
            left--;
            right++;
        }
        // 회문 문자열 추출
        StringBuilder result = new StringBuilder();
        for (int i = left + 1; i < right; i++) {
            result.append(str[i]);
        }
        return result.toString();
    }
}