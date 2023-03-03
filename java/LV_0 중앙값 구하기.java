class Solution {
    public int solution(int[] array) {
        int temp;
        for(int i=0; i<array.length; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i]>array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int answer = 0;
        int index = array.length/2;
        answer = array[index];
        
        
        return answer;
    }
}