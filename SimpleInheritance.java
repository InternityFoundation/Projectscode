
public class SimpleInheritance {
	public static void main(String [] args)
	{
		SubClass ob1=new SubClass();
		ob1.showmsgSuper();
		ob1.showmsgSub();
	}

}
class SuperClass
{
	int i,j,k,ans;
	void showmsgSuper()
	{
		System.out.println("This msg from super class");
	}
}
class SubClass extends SuperClass
{
	void showmsgSub()
	{
		System.out.println("This msg is from Sub class..");
		
	}
}