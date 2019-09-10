import java.util.Scanner;

class  P1
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the the value foe which you want matrix");
		int n=s.nextInt();
		for(int i=0; i<n;i++)
		{
			for (int j=0;j<n;j++ )
			{
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
}
