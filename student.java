class mul
{
	void product(int a,int b)
	{
		System.out.println(a*b);
	}
	
	void product(int a,int b,int c)
	{
		System.out.println(a*b*c );
	}
}
class student{
	
	public static void main(String[] args) {
    
		mul a=new mul();
		a.product(10, 10);
		a.product(10,10,10);
		 
		
	}
}