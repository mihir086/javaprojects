public class exp2 
{
    public static void main(String[] args) 
    {
        int i,f=1;

        int n=Integer.parseInt(args[0]);
        
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }

        System.out.println("Factorial is "+f);
    }
}
