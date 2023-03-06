class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length];
 
        // 원본배열(arr)의 마지막 인덱스(int i = arr.length - 1)부터 탐색하여
        // 거꾸로 배열(reverseArr)에 순서대로 값을 세팅한다.
        for (int i = num_list.length - 1, j = 0; i >= 0; i--, j++) {
            answer[j] = num_list[i];
        }
        
        return answer;
    }
}