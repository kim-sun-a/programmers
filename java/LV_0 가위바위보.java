class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        String[] rspArr = rsp.split("");
        
        for (String arr : rspArr) {
            if (arr.equals("2")) {
                answer += "0";
            } else if (arr.equals("0")) {
                answer += "5";
            } else if (arr.equals("5")) {
                answer += "2";
            }
        }
        
        return answer;
    }
}