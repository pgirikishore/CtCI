public class ZeroMatrix {

	public static int[][] zeroMatrix(int [][]arr)
	{
		boolean[] row = new boolean[arr.length];
		boolean[] column = new boolean[arr[0].length];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==0)
				{
					row[i]=true;
					column[j]=true;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if (row[i] == true || column[j]==true)
				{
					arr[i][j] =0;
				}
				
			}
		}
		return arr;
	}
	public static void print(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{0,1,2},{5,6,7},{6,7,0}};
		print(arr);
		System.out.println();
		print(zeroMatrix(arr));

	}

}
