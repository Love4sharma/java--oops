abstract class A
{
    abstract int firstMethod(int i);
     
    abstract int secondMethod(int i);
     
    int thirdMethod(int i)
    {
        return secondMethod(++i);
    }
}
 
abstract class B extends A
{
    @Override
    int secondMethod(int i)
    {
        return firstMethod(++i);
    }
}
 
class C extends B
{
    @Override
    int firstMethod(int i)
    {
        return ++i;
    }
}
 
public class mainclass3
{
    public static void main(String[] args)
    {
        C c = new C();
         
        System.out.println(c.thirdMethod(0)); 
    }
}