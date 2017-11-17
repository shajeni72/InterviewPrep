package stringalgorithm;

public class StringRotation {

	public static void main(String[] args) {
		System.out.println(StringRotation.isRotation("watterbottle", "erbottlewat"));
		System.out.println(StringRotation.isRotation("apple,", "ppale"));
	}
	public static boolean isSubString(String s1, String s2){
		return s1.contains(s2);
	}
	public static boolean isRotation(String s1, String s2){
		return isSubString(s1+s1, s2);
	}
}
