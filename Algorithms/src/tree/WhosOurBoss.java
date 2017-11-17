package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class WhosOurBoss {
	Stack<String> path=new Stack<>();
	
	Tree<String> hierarchy = new Tree<>();
	
	public static void main(String[] args) {
		WhosOurBoss wob = new WhosOurBoss();
		wob.buildTree();
		wob.closestCommonManager("Milton", "Nina");
	}
	
	public void buildTree(){
		hierarchy.setName("Bill");
		
		List<Tree<String>> employees_1 = new ArrayList<>();
		Tree<String> e1= new Tree<>();
		e1.setName("DOM");
		
			List<Tree<String>> employees_2 = new ArrayList<>();
			Tree<String> e21= new Tree<>();
			e21.setName("Bob");
			
			Tree<String> e22= new Tree<>();
			e22.setName("Peter");
			
				List<Tree<String>> employees_3 = new ArrayList<>();
				Tree<String> e31= new Tree<>();
				e31.setName("Milton");
				
				Tree<String> e32= new Tree<>();
				e32.setName("Nina");
				
				employees_3.add(e31);
				employees_3.add(e32);
				
				e22.setEmployees(employees_3);
			
			Tree<String> e23= new Tree<>();
			e23.setName("Porter");
			
			employees_2.add(e21);
			employees_2.add(e22);
			employees_2.add(e23);
			
			e1.setEmployees(employees_2);
		
		employees_2.add(e21);
		employees_2.add(e22);
		employees_2.add(e23);
		
		Tree<String> e2= new Tree<>();
		e1.setName("Samir");
		
		Tree<String> e3= new Tree<>();
		e1.setName("Micheal");
		
		
		employees_1.add(e1);
		employees_1.add(e2);
		employees_1.add(e3);
		
		hierarchy.setEmployees(employees_1);
	}
	public String closestCommonManager(String e1, String e2){
		LinkedList<String> path1 = new LinkedList<>();
		LinkedList<String> path2 = new LinkedList<>();
		findPath(hierarchy ,e1 , path1 );
		findPath(hierarchy ,e2 , path2 );
		
		path1.forEach(n ->System.out.println(n));
		path2.forEach(n ->System.out.println(n));
		return null;
	}
	public void findPath(Tree<String> n, String empName, List<String> l){
		if(n == null) return;
		
		l.add(n.getName());
		
		if(empName.equals(n.getName()))
			return;
		else{
			for(int i=0;i<n.getEmployees().size();i++)
				findPath(n.getEmployees().get(i), empName, l);
		}
		l.remove(l.size()-1);
	}
}

class Tree<T>{
	String name;
	List<Tree<T>> employees = new ArrayList<>();;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Tree<T>> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Tree<T>> employees) {
		this.employees = employees;
	}
}