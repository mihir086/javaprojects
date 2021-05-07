import java.util.Scanner;

class employee
{
    String name,desig;
    int id;
    float salary;

    public void getdata()
    {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter Name: ");
        name=in.nextLine();

        
        System.out.println("Enter designation: ");
        desig=in.nextLine();
        
        System.out.println("Enter ID:");
        id=in.nextInt();

        System.out.println("Enter salary: ");
        salary=in.nextFloat();

        in.close();
    }

    public void inc_sal()
    {
        if(desig.equalsIgnoreCase("Manager"))
        {
            salary+=5000;
        }

        else if(desig.equalsIgnoreCase("General Manager"))
        {
            salary+=10000;
        }

        else if(desig.equalsIgnoreCase("CEO"))
        {
            salary+=20000;
        }

        else if(desig.equalsIgnoreCase("Worker"))
        {
            salary+=2000;
        }

        else
        {
            System.out.println("Enter valid desig!!!");
        }
    }

    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("designation: "+desig);
        System.out.println("Salary: "+salary);
    }
}

public class exp5 
{
    public static void main(String[] args) 
    {
        employee obj=new employee();
        obj.getdata();
        obj.inc_sal();
        obj.display();
    }
}
