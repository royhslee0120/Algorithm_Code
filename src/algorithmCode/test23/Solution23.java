package algorithmCode.test23;

public class Solution23 {

    public int solution(int num) {
        long n = num; // 3n+1에서 int 오버플로우 방지

        if (n == 1) return 0;

        for (int count = 0; count < 500; count++) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }

            if (n == 1) return count + 1;
        }

        return -1;
    }
}
