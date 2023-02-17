public class IsUnique {
	
	public static boolean isUniqueWithoutAdditonalDS(String str)
	{
		if (str.length()> 256)
			return false;
		
		for (int i = 0; i<(str.length()-1); i++)
		{
			for(int j = i+1; j<str.length(); j++)
			{
				if (str.charAt(i) == str.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isUniqueWithAdditonalDS(String str)
	{
		if (str.length()> 256)
			return false;
		
		boolean[] chars = new boolean[256];
		int ch;
		
		for (int i = 0; i< str.length(); i++)
		{
			ch = str.charAt(i);
			if (chars[ch] == true)
			{
				return false;
			}
			chars[ch] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		/* With Additional Data Structure */
		/* Pass Conditions */
		System.out.println(isUniqueWithAdditonalDS("Kite"));
		System.out.println(isUniqueWithAdditonalDS("Tynor"));
		System.out.println(isUniqueWithAdditonalDS("Goldberg"));
		System.out.println(isUniqueWithAdditonalDS("Breaking"));
		System.out.println(isUniqueWithAdditonalDS("Bad"));
		
		/* Fail Conditions */
		System.out.println(isUniqueWithAdditonalDS("Runner"));
		System.out.println(isUniqueWithAdditonalDS("Jesse"));
		System.out.println(isUniqueWithAdditonalDS("AnnaGun"));
		System.out.println(isUniqueWithAdditonalDS("WalterWhite"));
		System.out.println(isUniqueWithAdditonalDS("Guss"));
		
		/* Without Additional Data Structure */
		/* Pass Conditions */
		System.out.println(isUniqueWithoutAdditonalDS("Kite"));
		System.out.println(isUniqueWithoutAdditonalDS("Tynor"));
		System.out.println(isUniqueWithoutAdditonalDS("Goldberg"));
		System.out.println(isUniqueWithoutAdditonalDS("Breaking"));
		System.out.println(isUniqueWithoutAdditonalDS("Bad"));
		
		/* Fail Conditions */
		System.out.println(isUniqueWithoutAdditonalDS("Runner"));
		System.out.println(isUniqueWithoutAdditonalDS("Jesse"));
		System.out.println(isUniqueWithoutAdditonalDS("AnnaGun"));
		System.out.println(isUniqueWithoutAdditonalDS("WalterWhite"));
		System.out.println(isUniqueWithoutAdditonalDS("Guss"));
	}
}