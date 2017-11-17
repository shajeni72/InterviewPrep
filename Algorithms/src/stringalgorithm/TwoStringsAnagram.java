package stringalgorithm;
/**
 * 1.4 Write a method to decide if two strings are anagrams or not.
 * **/
public class TwoStringsAnagram {
	public static void main(String[] args) {
		System.out.println(checkAnagram("dog","god"));
		System.out.println(checkAnagram("ooh","hhoo"));
		
	}
	public static boolean checkAnagram(String s1, String s2){
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		int[] letterCounter = new int[256];
		int numofUniqueChars = 0;
		int numofCharsCounted =0;
		for(char c:c1){
			if(letterCounter[c]==0){
				numofUniqueChars++;
			}
			letterCounter[c]++;
		}
		
		for(int i=0;i<c2.length;i++){
			if(letterCounter[c2[i]] == 0)
				return false;
			--letterCounter[c2[i]];
			if(letterCounter[c2[i]] == 0){
				++numofCharsCounted;
				if(numofCharsCounted == numofUniqueChars)
					return i== c2.length-1;
			}
		}
		return false;
	}
}
