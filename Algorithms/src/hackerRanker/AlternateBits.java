package hackerRanker;

public class AlternateBits {
	public static void main(String[] args) {
		AlternateBits a =new AlternateBits();
		System.out.println(a.hasAlternatingBits(4));
	}
	
	public boolean hasAlternatingBits(int n) {
		
		System.out.println(Integer.toBinaryString(n>>1));
		System.out.println(Integer.toBinaryString(n));
		System.out.println(n<<1 & n);
		if( (n>>1 & n) == 0)
			return true;
		return false;
		
	}
}
