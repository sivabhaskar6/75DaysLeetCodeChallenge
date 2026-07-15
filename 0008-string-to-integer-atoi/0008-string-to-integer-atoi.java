class Solution {
    public int myAtoi(String s) {
        int num = 0, sign = 1;
        boolean started = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ' && !started) {
                continue;
            }
            else if (ch == '-' && !started) {
                sign = -1;
                started = true;
            }
            else if (ch == '+' && !started) {
                started = true;
            }
            else if (ch >= '0' && ch <= '9') {
                int digit = value(ch);

                if (num >(Integer.MAX_VALUE - digit) / 10) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                num = num * 10 + digit;
                started = true;
            }
            else {
                break;
            }
        }

        return sign * num;
    }

    int value(char ch) {
        switch (ch) {
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            default: return -1;
        }
    }
}
