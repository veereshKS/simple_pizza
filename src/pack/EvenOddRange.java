import java.util.Scanner;
class EvenOddRange
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the lowwer range");
	int low=s.nextInt();
	System.out.println("enter the higher range");
	int high=s.nextInt();
	int count=0;
	for(int i=low;i<high;i++)
	{
		if(i%2==0)
			count++;
	}
	System.out.println("there are "+count+" even numbers are present in given range "+low+" to "+high);	
	}
}
