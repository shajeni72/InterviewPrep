package stringalgorithm;

public class NonRepeatingCharater {
	public static void main(String[] args) {
		NonRepeatingCharater nrc = new NonRepeatingCharater();
		System.out.println(nrc.nonRepeatingChrater("aabc"));
	}
	
	public char nonRepeatingChrater(String s){
		boolean[] charFlag=new boolean[256];
		int v=0;
		for(char c:s.toCharArray()){
			int ch =c-'a';
			if((v & (1<<ch))==0){
				v= 1<<ch;
			}else charFlag[c]=true;
		}
		
		for(char c:s.toCharArray())
			if(! charFlag[c]) return c;
		return ' ';
	}
}
