import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<>();

		int result = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				result = numbers[i] + numbers[j];
				if (!list.contains(result)) {
					list.add(result);
				}
			}
		}
        System.out.println("result="+list.toString());
        
		int[] answer = new int[list.size()];
        
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
		Arrays.sort(answer);
        
        for(int i: answer)
            System.out.print(i+" ");
        
		return answer;
    }
}