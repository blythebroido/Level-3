import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class testCase {
	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	boolean doBracketsMatch(String s) {
		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();
		if (s.charAt(0) == '}') {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{') {
				stack1.push(s.charAt(i));
			}
			if (s.charAt(i) == '}') {
				stack2.push(s.charAt(i));
			}
		}
		if (stack1.size() == stack2.size()) {
			return true;
		}
		return false;
	}

}
