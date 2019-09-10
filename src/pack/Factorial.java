import java.util.Scanner ;

class Factorial
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numer you want to find factrorial");
		int fac=s.nextInt();
		int sum=1;
		for(int i=1;i<=fac;i++)
		{
			sum *=i;
		}
		System.out.println("the factorial of "+fac+"! is "+sum);
	}
}