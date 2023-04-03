package LeetCodeStuff;

class RomanToInteger {

    static int result = 0;
    static int prevValue = 0;
    static int currValue = 0;

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }

    public static int romanToInt(String s) {

        // 1. assign each letter a value
        // 2. add each value to result
        // 3. if the currVal < preVal than subtract it from the result
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I':
                    currValue = 1;
                    break;
                case 'V':
                    currValue = 5;
                    break;
                case 'X':
                    currValue = 10;
                    break;
                case 'L':
                    currValue = 50;
                    break;
                case 'C':
                    currValue = 100;
                    break;
                case 'D':
                    currValue = 500;
                    break;
                case 'M':
                    currValue = 1000;
                    break;
                default:
                    return -1;
            }

            // based on roman numeral criteria where symbols are placed, this will add or remove numbers as necessary
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            prevValue = currValue;
        }
        return result;
    }

}