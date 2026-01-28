package algorithmCode.test10;

public class Solution10 {
    public double solution(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}
