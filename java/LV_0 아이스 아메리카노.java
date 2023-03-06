class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int change = 0;
        answer[0] = money/5500;
        answer[1] = change;
        if(money%5500 > 0) {
            change = money - (5500*answer[0]);
            answer[1] = change;
        }
        
        return answer;
    }
}