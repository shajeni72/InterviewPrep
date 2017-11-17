package crakingthecoding;

public class DuplicateCharacter {
	public static void main(String args[]){
		String a ="abcd";
		int check=0;
		for(char c: a.toCharArray()){
			int val = c-'a';
			if((check & (1 << val)) >0){
				System.out.println("Duplicate found");
				break;
			}
			check |=1<<val;
		}
	}
}
