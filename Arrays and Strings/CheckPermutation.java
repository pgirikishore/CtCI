
public class CheckPermutation {

	public static boolean checkPermatation(String s1, String s2)
	{
		if (s1.length() != s2.length())
			return false;
		
		int[] characters = new int[256];
		
		for(int i=0;i<s1.length();i++)
		{
			int ch = s1.charAt(i);
			characters[ch]++;
		}
		
		for(int i=0;i<s2.length();i++)
		{
			int ch = s2.charAt(i);
			characters[ch]--;
			if (characters[ch]<0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		/* Pass Conditions */
		System.out.println(checkPermatation("giri", "irig"));
		System.out.println(checkPermatation("cricket", "tekcric"));
		System.out.println(checkPermatation("erabk", "break"));

		/* Fail Conditions */
		System.out.println(checkPermatation("giri", "irige"));
		System.out.println(checkPermatation("girie", "irig"));
		System.out.println(checkPermatation("girie", "irigf"));

	}

}
