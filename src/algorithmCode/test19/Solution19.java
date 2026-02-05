package algorithmCode.test19;

public class Solution19 {
    public long solution(long n) {
        long answer = 0;
        long x = (long) Math.sqrt(n);
        if (x * x == n) {
            return answer = (x + 1) * (x + 1);
        } else {
            return answer = -1;
        }
    }
}