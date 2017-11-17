package stringalgorithm;
/**
 * 1.5 Write a method to replace all spaces in a string with ‘%20’.
 * **/
public class ReplaceEmptySpace {
    public static void main(String[] args) {
    	System.out.println(replaceEmptySpace("Hello World"));
	}
	public static String replaceEmptySpace(String s){
		char ch[]= s.toCharArray();
		int spaceCounter=0;
		for(char c:ch){
			if(c == ' ') ++spaceCounter;
		}
		if(spaceCounter > 0){
			char[] newCh = new char[ch.length+(2*spaceCounter)];
			System.out.println(newCh.length);
			int newchidx=-1;
			for(int i=0;i<ch.length;i++){
				if(ch[i] == ' '){
					newCh[++newchidx] = '%';
					newCh[++newchidx] = '2';
					newCh[++newchidx] = '0';
					
				}
				else
				newCh[++newchidx] = ch[i];
			}
			return new String(newCh);
		}
		return s;
	}
}
