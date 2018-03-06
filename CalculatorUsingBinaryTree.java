/* Building a calculator using Binary Tree. Given an infix expression, compute the final result of expression.
Steps: 
1. Infix to Postfix
2. Build expression tree using Postfix
3. Evaluate expression tree
*/


public class Solution{

	Node root = null;

	public int calculator(String s){
		List<String> postfix = infixToPostfix(s);
		StringBuilder sb= new StringBuilder();
		for(String str : postfix)
			sb.append(str);

		String postfix_str = sb.toString();

		buildTree(postfix_str);

		int res= evaluatePostfix(root);

		return res;
	}

	public List<String> infixToPostfix(String s){

		Stack<Character> operators = new Stack<Character>();
		int num = 0;
		boolean isOperand = false;
		List<String> postfix= new ArrayList<String>();

		for(char c : s.toCharArray()){
			if(c>='0' && c<='9'){
				num= num*10 + c - '0';
				isOperand= true;
			}
			else{
				if(isOperand){
					postfix.add(num);
					num = 0;
					isOperand= false;
				}
				if(c==' ' || c=='\t')
					continue;

				if(c == '('){
					operators.push(c);
				}
				else if(c == ')'){
					while(operators.peek()!='(')
						postfix.add(operators.pop());
					operators.pop(); //popping '('
				}
				else{
					while(!stack.isEmpty() && rank(c) <= rank(operators.peek())){
						postfix.add(operators.pop());
					}
					operators.push(c);
				}
			}
		}
		if(isNum)
			postfix.add(num);
		while(!operators.isEmpty()){
			postfix.add(operators.pop());
		}

		return postfix;
	}

	public int rank(char op){
		switch(op):
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;					
			default:
				return 0;
	}

	class Node{
		String val;
		Node left;
		Node right;

		Node(String item){
			val= item;
		}
	}

	public void buildTree(String postfix_str)
	{
		Node node;
		Stack<Node> stack = new Stack<Node>();
		for(int i=0;i<postfix_str.length();i++){
			char ch = postfix_str.charAt(i);

			if(ch>='0' || ch <= '9'){
				node = new Node(ch);
				stack.push(node+"");
			}
			else{
				if(ch == '+' || ch == '-' || ch == '/' || ch == '*'){
					Node n1 = stack.pop();
					Node n2= stack.pop();
					node = new Node(ch+"");
					node.left = n2;
					node.right= n1;
					stack.push(node);
				}
			}
		}

		root= stack.pop();
	}

	public double evaluate(Node node){
		if(node==null)
			return 0;

		if(node.left==null && node.right==null)
			return Integer.parseDouble(node.val);

		else{
			double left = evaluate(node.left);
			double right = evaluate(node.right);

			String operator = node.val;
			double result = 0;

			switch(operator){
				case "+": result = left + right; break;
				case "-": result = left - right; break;
				case "*": result = left * right; break;
				case "/": result = left / right; break;
			}
			return result;
		}

	}
	
}