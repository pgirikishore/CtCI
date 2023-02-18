public class OneAway {

	public static boolean oneAway(String s1, String s2)
	{
		if (s1.length() == s2.length())
		{
			if (s1.equals(s2))
			{
				return true;
			}
			else
			{
				int flag = 0;
				for (int i=0;i<s1.length();i++)
				{
					if ((s1.charAt(i) != s2.charAt(i)) && flag == 0)
					{
						flag = 1;
					}
					else if (s1.charAt(i) != s2.charAt(i))
					{
						return false;
					}
				}
				return true;
			}
		}
		
		else if (s1.length()>s2.length())
		{
			for (int i=0;i<s2.length();i++)
			{
				if (s1.charAt(i) != s2.charAt(i))
				{
					if(s1.equals(s2.substring(0, i) + s1.charAt(i) + s2.substring(i, s2.length())))
					{
						return true;
					}
					else
					{
						return false;
					}
				}
			}
		}
		
		else
		{
			for (int i=0;i<s1.length();i++)
			{
				if (s2.charAt(i) != s1.charAt(i))
				{
					if(s2.equals(s1.substring(0, i) + s2.charAt(i) + s1.substring(i, s1.length())))
					{
						return true;
					}
					else
					{
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(oneAway("pale","ple"));
		System.out.println(oneAway("pales","pale"));
		System.out.println(oneAway("pale","bale"));
		System.out.println(oneAway("pale","bake"));
		
		System.out.println(oneAway("ple","pale"));
		System.out.println(oneAway("pale","pales"));
		System.out.println(oneAway("bale","pale"));
		System.out.println(oneAway("bake","pale"));

	}

}
