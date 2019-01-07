class StaticDemo
{
static int a=14;
static int b=25;
static void show()
{
System.out.println("a =" +a);
}
}
class StaticByName{
public static void main(String[] args)
{
StaticDemo.show();
System.out.println("b=" +StaticDemo.b);
}
}