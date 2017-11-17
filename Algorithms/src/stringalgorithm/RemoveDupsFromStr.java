package stringalgorithm;

class RemoveDupsFromStr {
	public static void main (String[] args) {
		//code
		RemoveDupsFromStr removeDups = new RemoveDupsFromStr();
		String newStr = removeDups.removeDuplicate("aacdb","gafd");
		System.out.println(newStr);
	}
	
	public String removeDuplicate(String s1,String s2){
	    char[] ch1 = s1.toCharArray();
	    char[] ch2 = s2.toCharArray();
	    char[] ch3 = new char[ch1.length+ch2.length];
	    
	    boolean[] flg1 = new boolean[256];
	    boolean[] flg2 = new boolean[256];
	    for(int i=0;i<ch2.length;i++){
	        flg1[ch2[i]] = true;
	    }
	    int idx=0;
	    for(int i=0;i<ch1.length;i++){
	        if(! flg1[ch1[i]]){
	            ch3[idx] = ch1[i];
	            idx++;
	        }
	        flg2[ch1[i]] = true;
	    }
	    for(int i=0;i<ch2.length;i++){
	        if(! flg2[ch2[i]]){
	            ch3[idx] = ch2[i];
	            idx++;
	        }
	    }
	    
	    return new String(ch3);
	}
}