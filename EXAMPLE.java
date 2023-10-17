
public class EXAMPLE {

	public static void main(String[] args) 
	{
		int n=4;
		for (int i = 1; i <=n; i++) 
		{
			for (int j = i; j <=n; j++) 
			{
				System.out.print("  ");
			}
			int num=i;
			int k=n;
			
			for (int j = 1; j<=i; j++) 
			{
				--k;
				System.out.print(" "+num);
				num=num+k;
			}
			
			System.out.println();
			
			
		}

	}

}
