public class PalindromePermutation {

	public static boolean palindromePermutation(String str)
	{
		int[] arr = new int [256];
		int ch;
		int c = 0;
		
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			if (ch != ' ')
			{
				c++;
				arr[ch]++;
			}
		}
		if (c%2 != 0)
		{
			int flag = 0;
		    for(int i=0;i<256;i++)
		    {
		    	if (arr[i]%2 != 0 && flag == 1)
		    	{
		    		return false;
		    	}
		    	else if(arr[i]%2 != 0)
		    	{
		    		flag = 1;
		    	}
		    }
		}
		else
		{
			for(int i=0;i<256;i++)
		    {
		    	if (arr[i]%2 != 0)
		    	{
		    		return false;
		    	}
		    }
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(palindromePermutation("tact coa"));

	}

}
