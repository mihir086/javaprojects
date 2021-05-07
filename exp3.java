public class exp3 
{
    public static void main(String[] args) 
    {
        int []A= {1,2,3,4,5,6,7,8,9};
        int sum=0;

        System.out.println("Array is:");
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+",");
            sum+=A[i];
        }

        System.out.println("Sum is "+sum);
        System.out.println("Average is "+(sum/A.length));
    }
}
