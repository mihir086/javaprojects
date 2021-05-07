import java.util.Scanner;

class Employee
{
    String name;
    int age;
    float salary;

    public void getdata()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Name: ");
        name = in.nextLine();
        System.out.println("Enter Age: ");
        age = in.nextInt();
        System.out.println("Enter salary: ");
        salary = in.nextFloat();
    }

    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}

class Programmer extends Employee
{
    String pname,status;
    int numofdays;

    public void program()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Program name: ");
        pname=s.nextLine();

        System.out.println("Enter Status of Program: ");
        status=s.nextLine();

        System.out.println("Enter Number of days fpr which the Program is being going on: ");
        numofdays=s.nextInt();
    }

    public void programdetails()
    {
        System.out.println("Project Name: "+pname);
        System.out.println("Status: "+status);
        System.out.println("Number of Days Program is been going on: "+numofdays);
    }

}

class Analyst extends Employee
{
    String condition;
    int num_of_errors;

    public void Analysisdetails()
    {
        Scanner in2= new Scanner(System.in);
        System.out.println("Enter Project condition: ");
        condition = in2.nextLine();
        System.out.println("Enter Number of Errors till now: ");
        num_of_errors = in2.nextInt();
    }

    public void Report()
    {
        System.out.println("Project Condition: "+condition);
        System.out.println("Number of Errors: "+num_of_errors);
    }
}

class Projectleader extends Employee
{
    String projectname;
    int deadlinedays,durationdays;

    public void projectdetails()
    {
        Scanner in2= new Scanner(System.in);

        System.out.println("Enter Project name: ");
        projectname= in2.nextLine();

        System.out.println("Enter Duration: ");
        durationdays= in2.nextInt();

        System.out.println("Enter number of days left in Deadline: ");
        deadlinedays= in2.nextInt();
    }

    public void details()
    {
        System.out.println("Project Name: "+projectname);
        System.out.println("Duration: "+durationdays+ " days");
        System.out.println("Days left in Deadline: "+deadlinedays);
    }
}

public class exp7
{
    public static void main(String[] args) 
    {
        Projectleader ob1=new Projectleader();
        Programmer ob2=new Programmer();
        Analyst ob3=new Analyst();

        System.out.println("Project Leader:");
        ob1.getdata();
        ob1.projectdetails();
        ob1.display();
        ob1.details();
       
        System.out.println();
        System.out.println("Programmer:");

        ob2.getdata();
        ob2.program();
        ob2.display();
        ob2.programdetails();

        System.out.println();
        System.out.println("Analyst:");

        ob3.getdata();
        ob3.Analysisdetails();
        ob3.display();
        ob3.Report();
    }
}
