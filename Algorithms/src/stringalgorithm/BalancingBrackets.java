package stringalgorithm;

import java.util.Stack;

public class BalancingBrackets {
	
	public static void main(String[] args){
		BalancingBrackets bb = new BalancingBrackets();
		System.out.println(bb.checkBanlancingBrackets("****())))"));
	}
	
	public boolean checkBanlancingBrackets(String expr){
		
		char[] ch = expr.toCharArray();
		Stack<Integer> lbalance  = new Stack<>();
		Stack<Integer> rbalance  = new Stack<>();
		Stack<Integer> balance  = new Stack<>();
		for(int i=0;i<ch.length;i++){
			switch(ch[i]){
			case '(': 
				lbalance.push(i);
				break;
			case '*':
				balance.push(i);
				break;
			default:
				rbalance.push(i);
				break;
			}
		}
		int closeIdx = -1;
		int openIdx = -1;
		int balancerIdx = -1;
		
		while(lbalance.size() >0 && rbalance.size() > 0 || lbalance.size() >0 && balance.size() > 0 || balance.size() >0 && rbalance.size() > 0){
			if(lbalance.size() >0 && rbalance.size() > 0){
				closeIdx = rbalance.peek();
				openIdx = lbalance.peek();
				if(openIdx < closeIdx){
			    	rbalance.pop();
			    	lbalance.pop();
			    }
			}
		   if(balance.size() >0 && rbalance.size() > 0){
				balancerIdx = balance.peek();
				closeIdx = rbalance.peek();
				if(balancerIdx < closeIdx){
					rbalance.pop();
					balance.pop();
				}
			}
		  if(balance.size() >0 && lbalance.size() > 0){
				balancerIdx = balance.peek();
				openIdx = lbalance.peek();
				if(balancerIdx > openIdx){
					lbalance.pop();
					balance.pop();
				}
			}
		}
		if(lbalance.size() > 0 || rbalance.size() >0)
			return false;
		return true;
	}

}
