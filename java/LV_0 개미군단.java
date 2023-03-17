class Solution {
    public int solution(int hp) {
        int answer = 0;
        int cap = 0;
        int soldier = 0;
        int work = 0;
        
        cap = hp/5;
        hp = hp - (cap * 5);
        
        if(hp > 0) {
            soldier = hp/3;
            hp = hp - (soldier * 3);
        }
        
        if(hp > 0) {
            work = hp/1;
        }
        
        answer = cap + soldier + work;
        
        return answer;
    }
}