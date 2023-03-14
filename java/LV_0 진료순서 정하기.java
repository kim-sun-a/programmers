import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int k = emergency.length;
        int[] answer = new int[k];
        int[] arr = new int[k];
        
        for(int i=0; i<=emergency.length-1; i++) {
            arr[i]=emergency[i];
        }
        
        Arrays.sort(arr);
        
        for(int i=0; i<=emergency.length-1; i++) {
            for(int j=0; j<=emergency.length-1; j++) {
                if(arr[i]==emergency[j]) {
                    answer[j]=emergency.length-i;
                }
            }
        }
        
        
        
        return answer;
    }
}