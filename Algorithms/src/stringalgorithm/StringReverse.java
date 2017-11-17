package stringalgorithm;

public class StringReverse {

	public static void main(String args[]){
		StringReverse reverse = new StringReverse();
		String reversed = reverse.reverse("nalan");
		System.out.println(reversed);
	}
	
	public String reverse(String s){
		if(s == null || s.length()<=1)
			return s;
		else{
			return s.charAt(s.length()-1)+reverse(s.substring(0, s.length()-1));
		}
	}
}
