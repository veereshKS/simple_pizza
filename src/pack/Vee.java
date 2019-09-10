class Vee 
{
	int a;
	int b;
	{System.out.println(a+"IIB"+b);}
	Vee(int i,int j){ System.out.println("hi"); this.a=i; this.b=j; }
	void disp() 
	{
		System.out.println("hii veer");
	}
	public static void main(String[] args) 
	{
		Vee q=new Vee(10,20);
		Vee qq=new Vee(70,80);
		System.out.println("the a : "+q.a);//10
		System.out.println("the b : "+q.b);//20
		System.out.println("the a : "+qq.a);//70
		System.out.println("the b : "+qq.b);//80
	}
}
