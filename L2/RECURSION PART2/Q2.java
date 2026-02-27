class Q2 {
    public int stringToInteger(String str) {
        int num = 0;
        boolean negative = false;
        int i = 0;
        if (str.charAt(0) == '-') {
            negative = true;
            i = 1;
        }
        for (; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') break; 
            num = num * 10 + (c - '0');
        }
        return negative ? -num : num;
    }
}