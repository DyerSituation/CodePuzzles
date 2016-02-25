
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class LongNightsinSadPlaces {
//	public static void main(String[] args){
//		Solution2 a = new Solution2();
//		a.solution("111+");
//		System.out.println(a.solution("11+"));
//	}
	
	public int solution(String S) {
		if(S.length() == 0)
			return -1;
		HashMap<Character, Integer> digits = new HashMap<Character, Integer>();
		digits.put('0', 0); digits.put('1', 1); digits.put('2', 2); 
		digits.put('3', 3); digits.put('4', 4); digits.put('5', 5);
		digits.put('6', 6); digits.put('7', 7); digits.put('8', 8);
		digits.put('9', 9);
		int a;
		int b;

		Stack machine = new Stack();
		for(int i = 0; i < S.length(); i++){
			if(digits.containsKey(S.charAt(i))){
				machine.push(digits.get(S.charAt(i)));
			}
			if(S.charAt(i)=='+'){
				if(!machine.empty())
					a = (int) machine.pop();
				else
					return -1;
				if(!machine.empty())
					b = (int) machine.pop();
				else
					return -1;
				machine.push(a+b);
			}

			if(S.charAt(i)=='*'){
				if(!machine.empty())
					a = (int) machine.pop();
				else
					return -1;
				if(!machine.empty())
					b = (int) machine.pop();
				else
					return -1;
				machine.push(a*b);
			}
		}
		return (int) machine.pop();
	}
}