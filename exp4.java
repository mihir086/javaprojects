import java.util.Scanner;

class Student
{
    String name;
    int roll,marks1,marks2,marks3;

    public void getdata()
    {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter Name: ");
        name=in.nextLine();

        System.out.println("Enter Roll: ");
        roll=in.nextInt();

        System.out.println("Enter Marks of 3 subjects: ");
        marks1=in.nextInt();
        marks2=in.nextInt();
        marks3=in.nextInt();
        in.close();
    }

    public void display()
    {
        System.out.println("Name: "+ name);
        System.out.println("Roll: "+ roll);
        System.out.println("Marks 1: "+ marks1);
        System.out.println("Marks 2: "+ marks2);
        System.out.println("Marks 3: "+ marks3);
    }
}

public class exp4 
{
    public static void main(String[] args) 
    {
        Student obj= new Student();
        obj.getdata();
        obj.display();
    }
}
