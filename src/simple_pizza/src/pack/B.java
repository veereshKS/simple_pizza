class A 
{
	int i;
	String j;
	A(int i,String j)
	{
		this.i=i;
		this.j=j;
	}
}




class B
{
	public static void main(String[] args)
	{
		A a=new A(10,"vee");
		System.out.println(a.i);
		System.out.println(a.j);
		A(44,"ceve");
		System.out.println(a.i);
		System.out.println(a.j);
	}
}