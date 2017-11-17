package hackerRanker;

public class NonUniqueChar {
	public static void main(String[] args) {
//		int index = NonUniqueChar.firstUniqChar("loveleetcode");
//		System.out.println(index);
		char c =(char)9;
		System.out.println("c ="+c);
	}

	public static int firstUniqChar(String s) {
        boolean[] dupChar=new boolean[26];
        int val =0;
        
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            System.out.println(val & 1<<s.charAt(i));
            if((val & 1<<s.charAt(i))>0){
                dupChar[idx]=true;
            }
            val |=1<<s.charAt(i);
        }
        
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            if(! dupChar[idx])
                return i;
        }
        
        return 0;
    }
}
