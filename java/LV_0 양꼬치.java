class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        answer = 12000 * n;
        
        if(n/10>0) {
            k = k-(n/10);
        }
        answer += 2000*k;
        
        return answer;
    }
}