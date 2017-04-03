import java.util.Stack;

public class FunWithStack {
	public static void main(String[] args) {
		// Stack <String> myStack = new Stack <String>();
		// myStack.push("a");
		// myStack.push("b");
		// myStack.push("c");
		// myStack.push("d");
		// myStack.push("e");
		// for (int i = 0; i < 5; i++) {
		// System.out.println(myStack.pop());
		// }
		// System.out.println(myStack.size());

		System.out.println(reverseString("taco"));
	}

	static String reverseString(String s) {
		Stack<Character> stack = new Stack<Character>();
		String answer = "";
		for (int j = 0; j < s.length(); j++) {
			stack.push(s.charAt(j));
		}
		for (int i = 0; i < s.length(); i++) {
			answer += stack.pop();
		}
		return answer;
	}
}
