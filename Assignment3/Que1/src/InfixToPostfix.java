
public class InfixToPostfix {

	public static int prio(char opr) {
		switch(opr) {
		case '$' :return 11;
		case '/' :return 10;
		case '*' :return 10;
		case '%' :return 10;
		case '+' :return 9;
		case '-' :return 9;
		}
		return 0;
	}
	public static String infixToPostfix(String infix) {
		Stack st = new Stack(19);
		StringBuilder postfix = new StringBuilder();
		for(int i = 0 ; i < infix.length() ; i++) {
			char ele = infix.charAt(i);
			if(Character.isDigit(ele))
				postfix.append(ele);
			else if (ele == '(')
				st.push(ele);
			else if(ele == ')') {
				while(st.peek() != '(') {
					postfix.append(st.pop());
				}
				st.pop();
			}
			else {
				while(!st.isEmpty() && prio(st.peek()) >= prio(ele)) {
					postfix.append(st.pop());
				}
				st.push(ele);
			}
		}
		while(!st.isEmpty()) {
			postfix.append(st.pop());
		}
		return postfix.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infix = "(A+B)*C-(D-E)*(F+G)";
	
		System.out.println("Infix: "+ infix);
		String postFix = infixToPostfix(infix);
		System.out.println("Postfix: "+postFix);
	}

}
