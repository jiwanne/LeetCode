class Solution {
    public String convert(String s, int numRows) {
 
        // PAYPALISHIRING 

        // 이게 numRows 가 3일때 패턴
        // 순서로 치면 0P 1A 2Y 3P 4A 5L 6I 7S 8H 9I 10R 11I 12N 13G이게
        // 0P 4A 8H 12N / 1A 3P 5L 7S 9I 11I 13G / 2Y 6I 10R
        // output : PAHNAPLSIIGYIR

        // numRows가 4일때 패턴
        // 0P 1A 2Y 3P 4A 5L 6I 7S 8H 9I 10R 11I 12N 13G
        // 0P 6I 12N / 1 5 7 11 13 / 2 4 8 10 / 3 9 6

        // 5 
        // 0 8/ 1 7 9 / 2 6 10 / 3 5 11 13 

        // 6 
        // 0 10 / 1 9 11 / 2 8 12 / 4 6 / 5

        if (numRows == 1 || numRows >= s.length()) return s;
        
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int cyc = 2 * numRows - 2;

        for(int row = 0; row < numRows; row++) {
            for(int j = row; j < n; j += cyc) {
                sb.append(s.charAt(j));

                int diag = j + cyc - 2 * row;
                if(row != 0 && row != numRows - 1 && diag < n) {
                    sb.append(s.charAt(diag));
                }

            }
        }
        return sb.toString();





    }
}