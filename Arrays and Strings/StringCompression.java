public class StringCompression {

	public static String strCompression(String str)
	{
		String result = "";
		char prev = str.charAt(0);
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if (ch == prev)
			{
				count ++;
			}
			else
			{
				result = result + prev + count;
				prev = ch;
				count = 1;
			}
		}
		result = result + prev + count;
		
		if (result.length()>=str.length())
		{
			return str;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(strCompression("abcd"));
		System.out.println(strCompression("aabbccdd"));
		System.out.println(strCompression("aaabccddeffggg"));
		
		System.out.println(strCompression("aaaa"));
		System.out.println(strCompression("aaaaaaaabbg"));
		System.out.println(strCompression("cccdeee"));
	}

}
