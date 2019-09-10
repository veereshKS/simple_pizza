package pizza;

import java.util.*;

class  Pizza extends PaymentPage
{
	Scanner s=new Scanner(System.in);
	Pizza cus;
	String name[]=new String[11];
	double price[]=new double[11];
	ArrayList<Integer> cur_cart=new ArrayList<Integer>();
	int f;
	int amount =0;
	{
		name[1]="Margherita";
		name[2]="Double Cheese Margherita";
		name[3]="Farm House";
		name[4]="Peppy Paneer";
		name[5]="Mexican Green Wave";
		name[6]="PEPPER BARBECUE CHICKEN";
		name[7]="CHICKEN SAUSAGE";
		name[8]="Chicken Golden Delight";
		name[9]="Non Veg Supreme";
		name[10]="Chicken Dominator";
		price[1]=80;
		price[2]=110;
		price[3]=220;
		price[4]=200;
		price[5]=300;
		price[6]=140;
		price[7]=100;
		price[8]=230;
		price[9]=300;
		price[10]=350;
	}
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
   
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	void disp()
	{
		System.out.println( "no\tPizza\t\t\tprice");
		for(int i=1;i<=10;i++)
		System.out.printf("%-2.2s %-30.30s %-30.30s%n",i,name[i],price[i]);
	}
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	void addCart(int k)
	{
	    cur_cart.add(k);
		System.out.println("successfully added to cart");
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	void delCart()
	{
		System.out.println("\n\n\n enter the number you want to delete");
		int k=s.nextInt();
		cur_cart.remove(--k);
		System.out.println("sucessfully deleted");
		dispCart();
			
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	void dispCart()
	{
		int amount =0;
		System.out.println("\n\n the items which are present in cart is");
		int len=cur_cart.size();
		System.out.println( "no\tPizza\t\t\tprice");
		int v=1;
		for(int i=0;i<len;i++)
		{
				System.out.printf("%-2.2s %-30.30s %-30.30s%n",v,name[cur_cart.get(i)],price[cur_cart.get(i)]);
			v++;
		}
		for(int i=0;i<len;i++)
		{
				amount +=price[cur_cart.get(i)];
		}
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.print("total amount ");
		System.out.printf("%25.25s%n",amount);
		System.out.println("---------------------choose one option------------------------");
		int j=D.dispCartMethod(cur_cart);
		//j--;
		int ch=s.nextInt();
		if(j==3)
			switch(ch)
			{
				case 1: delCart();
						break;
				case 2:add();
				case 3:cus.dispP(cus);
						break;
				default : System.out.println("invalid");
			}
		else
			switch(ch)
			{
				case 1:add();
				case 2:cus.dispP(cus);
						break;
				case 3:
				default : System.out.println("invalid");
			}
		
	}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	//--------------------------------------------------------------------------------------------------------------------
	void welcomePage(Pizza cust)
	{
		cus=cust;
		System.out.println("--------------------------WELCOME    TO     DOMINOS     PIZZZA---------------------\n\n");
		System.out.println("choose option");
		System.out.println("1 : pizza list ");
		System.out.println("2 : exit");
		int ch=s.nextInt();
		switch(ch)
		{
			case 1: add();
						 break;
			case 2: endPage();
			default : System.out.println("----------------invalid option-------------------");
						welcomePage(cus);
		}
	}
	//-------------------------------------------------------------------------------------------------------------------
	 void add()
	{
		disp();
		int l=0;
		Scanner s=new Scanner(System.in);
		System.out.println("-----------choose one option------------\n for exit press 0 \t view cart press 44\n for buy press 55");
		int k=s.nextInt();
		switch(k)
		{
			case   1 :
			case   2:
			case   3:
			case   4:
			case   5:
			case   6:
			case   7:
			case   8:
			case   9:
			case   10 : addCart(k);
												 System.out.println("choose option\n 1 : add more pizza\n 2 : view cart\n 3 :proceed payment  ");
												 l=s.nextInt();
												 switch(l)
												{
													 case 1 : add();
													 break ;
													 case 2 : dispCart();
													 add();
													 break ;
													 case 3 : cus.dispP(cus);
													 default : System.out.println("-----------------invalid----------------");
												}
			case 0 : endPage() ;
			case 55:cus.dispP(cus);
			case 44: dispCart();
			default : System.out.println("----------------invalid----------------");
			add();
		}
	}


	void endPage()
	{
		System.out.println(" --------------- THANK YOU VISIT AGAIN----------------------------");
		System.exit(1);
	}

}
