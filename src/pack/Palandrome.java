import java.util.Scanner;

class Palandrome
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the given Number");
		int num=s.nextInt();
		int num2=0;
		for(int i=num;i>0;)
		{
			num2 *=10;
			num2+=i%10;
			i/=10;
		}
		if(num==num2)
			System.out.println("the number "+num+" is "+" Palandrome ");
		else
			System.out.println("the number "+num+" is "+"not Palandrome.......");
	}
}