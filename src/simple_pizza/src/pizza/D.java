package pizza;

import java.util.*;

class D
{
	static String s[]=new String[3];
	static
	{
		s[0]=" : delet items from cart";
		s[1]=" : add items to cart";
		s[2]=" : proceed payment";
	}
	static int dispCartMethod(ArrayList<Integer> cur_cart)
	{
		if (cur_cart.size()>0) {
			for(int k=0;k<3;k++)
			{
		 		System.out.print(++k);
		 		System.out.println(s[--k]);
			}
			return 3;
		}
		int j=1;
		if (cur_cart.size()==0)
			for(int k=1;k<3;k++)
			{
		 		System.out.print(j);
		 		j++;
		 		System.out.println(s[k]);
			}
		return 2;
	}
}