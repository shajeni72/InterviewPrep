package stringalgorithm;

public class RemoveDuplicateCharacters {
	
	public static void main(String[] args) {
		RemoveDuplicateCharacters rdc = new RemoveDuplicateCharacters();
		String newStr = rdc.removeDuplicates("aabb");
		//System.out.println(newStr);
		newStr= rdc.removeDuplicates2("aabb");
		System.out.println(newStr);
	}

	public String removeDuplicates(String s){
		boolean[] dupFlag = new boolean[256];
		int val=0;
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()){
			int ch = c-'a';
			if(! dupFlag[c]){
				sb.append(c);
			}
			if((val & 1<<ch)==0) {
				dupFlag[c]=true;
				val |= 1<<ch;
			}
		}
		return sb.toString();
	}
	public String removeDuplicates2(String s){
		char[] ch = s.toCharArray();
		int val = 0;
		val |= 1<<ch[0];
		for(int i=1;i<s.length();i++){
			if((val & 1<<ch[i]) != 0){
				if(i<ch.length-2){
					ch[i]=ch[i+1];
				}
				if(i < ch.length){
					ch[i]=0;
				}
			}
			val |= 1<<ch[i];
		}
		return new String(ch);
	}
}
