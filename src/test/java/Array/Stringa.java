package Array;


public class Stringa{
	
	public static void main(String[] args) {
		
		String s = "This is system";
		String[] splitString = s.split(" ");
		System.out.println(splitString[0]);
		System.out.println(splitString[1]);
		System.out.println(splitString[2]);
		
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
	}
}
