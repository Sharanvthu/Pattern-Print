
public class numberPrint 
{
	public static void main(String[] args) 
	{
		int num=4;
		for (int i=1;i<=num;i++)
		{
			for (int j=i;j<=num;j++)
			{
				System.out.print("  ");
			}
			int n=i;
			int k=num;
			for (int j=1;j<=i;j++)
			{
				--k;
				System.out.print(n+" ");
				n=n+k;
			}
			System.out.println();
		}
	}
}
