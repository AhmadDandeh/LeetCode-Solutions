class Solution {
    public String nearestPalindromic(String n) {
        long number = Long.parseLong(n);
        if(number == 0) return "1";
        int nL = n.length();
        boolean isOdd = (nL&1) == 1;
        long reflection = getReflection(n, isOdd, nL);
        if(reflection == number){
            long upper = getUpper(n, isOdd, nL);
            long lower = getLower(n, isOdd, nL);
            return upper - number < number-lower? String.valueOf(upper):String.valueOf(lower); 
        }
        else if(reflection<number){
            long upper = getUpper(n, isOdd, nL);
            return upper - number < number-reflection? String.valueOf(upper):String.valueOf(reflection); 
        }
        else{
            long lower = getLower(n, isOdd, nL);
            return reflection - number < number-lower? String.valueOf(reflection):String.valueOf(lower); 
        }
    }

    public long getReflection(String number, boolean isOdd, int length){
        int mid = (length+1)/2;
        long left = Long.parseLong(number.substring(0, mid));
        long base = left;
        if(isOdd) base /=10;
        return buildNumber(left, base);
    }

    public long getLower(String number, boolean isOdd, int length){
        int mid = (length+1)/2;
        long left = Long.parseLong(number.substring(0, mid));
        int leftL = mid;
        left--;
        if(isOdd){
            if(left<Math.pow(10, mid-1)){
                return buildNumber(left, left);
            }
            else{
                long base = left/10;
                return buildNumber(left, base);
            }
        }
        else{
            if(left<Math.pow(10, mid-1)){
                long base = left*10+9;
                return buildNumber(base, left);
            }
            else{
                return buildNumber(left, left);
            }
        }
    }
    
    public long getUpper(String number, boolean isOdd, int length){
        int mid = (length+1)/2;
        long left = Long.parseLong(number.substring(0, mid));
        int leftL = mid;
        left++;
        if(isOdd){
            if(left == (long) Math.pow(10, mid)){
                left /= 10;
                return buildNumber(left, left);
            }
            else{
                long base = left/10;
                return buildNumber(left, base);
            }
        }
        else{
            if(left == (long) Math.pow(10, mid)){
                long base = left/10;
                return buildNumber(left, base);
            }
            else{
                return buildNumber(left, left);
            }
        }
    }

    public long buildNumber(long left, long base){
        while(base>0){
            left = left*10 + base%10;
            base /= 10;
        }
        return left;
    }
}