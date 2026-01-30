package algorithmCode.test15;

public class Solution15 {
    public int solution(int n) {
        int answer = 0;
        for (int x = 1; x <= n; x++) {
            if (n % x == 1) {
                return x;
            }
        }
        return answer;
    }
}
