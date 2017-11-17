package stringalgorithm;

public class LongestSubstringwithoutRepeatingCharacter {
	public static void main(String[] args) {
		
	}
	
	public int longetSubString(String s){
		boolean[] flag=new boolean[26];
		int longetubStringLength = 0;
		for(int i=0;i<s.length();i++){
			if(flag[s.charAt(i)-'a']){
				longetubStringLength = Math.max(longetubStringLength, i);
			}else{
				flag[s.charAt(i)-'a'] = true;
			}
		}
		
		return longetubStringLength;
	}
}
