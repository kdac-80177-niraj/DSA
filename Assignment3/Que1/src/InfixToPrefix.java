
public class InfixToPrefix {

	public static int prio(char opr) {
		switch(opr) {
		case '$': return 11;
		case '/': return 10;
		case '*': return 10;
		case '%': return 10;
		case '+': return 9;
		case '-': return 9;
		}
		return 0;
	}
	public static String infixToPrefix(String infix) {
		Stack st = new Stack(22);
		StringBuilder prefix = new StringBuilder();
		for(int i = infix.length()-1 ; i >= 0 ; i--) {
			char ele = infix.charAt(i);
			if(Character.isDigit(ele))
				prefix.append(ele);
			else if(ele == ')') {
				st.push(ele);
			}
			else if(ele == '(') {
				while(st.peek() != ')') {
					prefix.append(st.pop());
				}
				st.pop();
			}
			else {
				while(!st.isEmpty() && prio(st.peek()) > prio(ele)) {
					prefix.append(st.pop());
				}
				st.push(ele);
			}
		}
		while(!st.isEmpty()) {
			prefix.append(st.pop());
		}
		prefix.reverse();
		return prefix.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infix = "K + L - M*N + (O^P) * W/U/V * T + Q";
		
		System.out.println("Infix: "+ infix);
		String preFix = infixToPrefix(infix);
		System.out.println("Prefix: "+preFix);
	}

}
