import java.util.Stack;

/*”√’ª µœ÷***/
public class Evalute_Reverse_Polish_Notation_150 {
	public int evalRPN(String[] tokens) {
        Stack<String>s = new Stack<String>();
        for(int i=0;i<tokens.length;i++){
        	String temp = tokens[i];
        	if(temp.equals("*")){
        		int a = Integer.parseInt(s.pop());
        		int b = Integer.parseInt(s.pop());
        		String c = String.valueOf(a*b);
        		s.push(c);
        	}
        	else if(temp.equals("+")){
        		int a = Integer.parseInt(s.pop());
        		int b = Integer.parseInt(s.pop());
        		String c = String.valueOf(a+b);
        		s.push(c);
        	}
        	else if(temp.equals("/")){
        		int a = Integer.parseInt(s.pop());
        		int b = Integer.parseInt(s.pop());
        		String c = String.valueOf(b/a);
        		s.push(c);
        	}
        	else if(temp.equals("-")){
        		int a = Integer.parseInt(s.pop());
        		int b = Integer.parseInt(s.pop());
        		String c = String.valueOf(b-a);
        		s.push(c);
        	}else {
        		s.push(temp);
        	}
        }
        return Integer.parseInt(s.pop());
    }
	public static void main(String[] args) {
		String tokens[] ={"4", "13", "5", "/", "+"};
		Evalute_Reverse_Polish_Notation_150 e150 = new Evalute_Reverse_Polish_Notation_150();
		System.out.println(e150.evalRPN(tokens));

	}

}
