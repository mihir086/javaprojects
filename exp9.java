public class exp9 
{
    public double area(float radius)
    {
        return(Math.PI*radius*radius);
    }

    public int area(int side)
    {
        return (side*side);
    }   

    public float area(int length,int width)
    {
        return (length*width);
    }

    public double area(int base, float height)
    {
        return (0.5*height*base);
    }
    public static void main(String[] args) 
    {
        exp9 obj = new exp9();

        System.out.println("Area of Rectangle of length 4 nd width 5 units: "+obj.area(4,5));
        System.out.println("Area of Triangle of height 5 and base 6.04 units: "+obj.area(5,6.05f));
        System.out.println("Area of circle of radius 4 units: "+obj.area(4f));
        System.out.println("Area of square of side 5 units: "+obj.area(5));
    }
}
