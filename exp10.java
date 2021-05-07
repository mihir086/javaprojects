interface A
{
    void fun();
}
interface animals
{
    void category();
}

class dogs
{
    public void breed()
    {
        System.out.println("Breed is german shephard");
    }
}
public class exp10 extends dogs implements A,animals
{
    public void fun()
    {
        System.out.println("Multiple Inheritence");
    }
    public void category()
    {
        System.out.println("Category is Dogs");
    }
    public static void main(String[] args)
    {
        exp10 ob = new exp10();
        ob.fun();
        ob.category();
        ob.breed();
    }
}
