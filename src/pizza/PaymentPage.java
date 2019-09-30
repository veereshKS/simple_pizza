package pizza;

import java.text.DecimalFormat;
import java.util.*;

class PaymentPage 
{
	Pizza pizza;
	Scanner s=new Scanner(System.in);
	DecimalFormat ft = new DecimalFormat("##.##");
	double amount=0;
	int vocher;
	String vochers[]= new String[3];
	{
		vochers[0]="PIZZA@25";
		vochers[1]="PIZZA@50";
		vochers[2]="PIZZA@75";
	}
	void dispP(Pizza cus)
	{
		pizza=cus;
		amount=0;
		vocher=0;
		for(int i=0;i<pizza.cur_cart.size();i++)
		{
			amount +=pizza.price[pizza.cur_cart.get(i)];
		}
		System.out.println("the items you have selected are");
		displyItems();
		System.out.println("--------------------------------------------------------");
		System.out.println("the total amount \t\t  "+ft.format(amount)+"rs");
		System.out.println("--------------------------------------------------------");
		int j=options();
		int ch=s.nextInt();
		if(j==3)
		{
			switch(ch)
			{
				case 1 : int i=applyVocher();
						calc(i);
				break;
				case 2: pizza.dispCart();
				break;
				case 3: proPay();
				break ;
				default : System.out.println("----------invalid-----------");
			}
		}
		if(j==2)
		{
			switch(ch)
			{
				case 1: pizza.dispCart();
				break;
				case 2: proPay();
				break ;
				default : System.out.println("----------invalid-----------");
			}
		}
	}

	void displyItems()
	{
		System.out.println( "no\tPizza\t\t\tprice");
		int v=1;
		for(int i=0;i<pizza.cur_cart.size();i++)
		{
				System.out.printf("%-2.2s %-30.30s %2.30s%n",v,pizza.name[pizza.cur_cart.get(i)],pizza.price[pizza.cur_cart.get(i)]);
			v++;
		}
		double temp=(18*amount)/100;   	// applying GST of 18% to amount
		System.out.printf("GST  18%% %29.1f\n",temp);
		System.out.printf("Delivery charges %21.1f\n",20.0);
		amount +=temp+20;		//adding both GST and Delivery charges
	}
	
	int options()
	{
		if(pizza.cur_cart.size()>0)
		{
			if(vocher==0)
			{
				System.out.println("choose one option\n1 : apply coupon\n2 : view cart\n3 : check out");
				return 3;
			}
			else
				System.out.println("choose one option\n1 : view cart\n2 : check out");
		}
		else 
			System.out.println("choose one option\n1 : view cart\n2 : check out");	
		return 2;
	}

	int applyVocher()
	{
		System.out.println("enter the voucher");
		String voch=s.next();
		if (voch.equals(vochers[0])  )
		{
			vocher++;
			return 25;
		}
		else if(voch.equals(vochers[1] ))
		{
			vocher++;
			return 50;
		}
		else if(voch.equals(vochers[2]))
		{
			vocher++;
			return 75;
		}
		else
			System.out.println("----------------invalid--------------------");
		dispP(pizza);
		return 1;
	}

	void calc(int k)
	{
		percentage(k);
		options2();
	}

	void percentage(int k)
	{
		amount -= ((k*amount)/100); // calculating the percentage 
	}

	void options2()
	{
		System.out.println("\n\n--------------------------------------------------------");
		System.out.println("the total amount \t\t\t "+ft.format(amount)+"rs");
		System.out.println("--------------------------------------------------------");
		System.out.println("choose one option\n1 : view cart\n2 : check out");
		int ch = s.nextInt();
		switch(ch)
			{
				case 1: pizza.dispCart();
				break;
				case 2: proPay();
				break ;
				default : System.out.println("----------invalid-----------");
			}
	}
	void proPay()
	{
		System.out.println("-----------------------------------------------------------");
		System.out.println("               order placed sucessfull");
		System.out.println("-----------------------------------------------------------");
		pizza.welcomePage(pizza);
	}

 
}