package hackerRanker;

import java.util.*;

public class MatchingBrackets {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack =new Stack<Character>();
        
        for(int i=0;i<expression.length();i++){
            char c = expression.charAt(i);
            
            switch(c){
                case '[' : stack.push(c); break;
                case ']':
                    if(stack.peek() == '[')
                        stack.pop();
                    break;
                case '{':stack.push(c);break;
                case'}':
                    if(stack.peek() == '{')
                        stack.pop();
                    break;
                case'(':stack.push(c);break;
                case')':
                    if(stack.peek() == '(')
                        stack.pop();
                    break;
            }
            
        }
        
        if(stack.size() == 0)
             return true;
        return false;
    }
  
    public static void main(String[] args) {
    	MatchingBrackets mb = new MatchingBrackets();
    	 System.out.println( (mb.isBalanced("{[()]}") ? "YES" : "NO") );
    	 System.out.println( (mb.isBalanced("{[(])}") ? "YES" : "NO") );
    	 System.out.println( (mb.isBalanced("{{[[(())]]}}") ? "YES" : "NO") );
    	 
    }
}
