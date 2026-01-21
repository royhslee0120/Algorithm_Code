package algorithmCode.test5;

public class Solution5 {
    public int solution(int age) {
        int answer = 0;
        if(0 < age && 120 >= age){
            answer = 2022 - age + 1;
        }
        return answer;
    }
}