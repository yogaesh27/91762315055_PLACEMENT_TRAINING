class Solution {
    public String largestGoodInteger(String num) {
        String result = "";
        
        for (int i = 0; i < num.length() - 2; i++) {
            char c = num.charAt(i);
            if (c == num.charAt(i + 1) && c == num.charAt(i + 2)) {
                String temp = "" + c + c + c;
                if (result.compareTo(temp) < 0) {
                    result = temp;
                }
            }
        }
        
        return result;
    }
}