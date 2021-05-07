import java.util.*;

class student
{
    int roll_no;
    String name;
    int id;

    void enterinfo()
    {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter Roll Number: ");
        roll_no=ob.nextInt();
        System.out.println("Enter ID: ");
        id=ob.nextInt();
        System.out.println("Enter Name: ");
        name=ob.next();
    }
}

class exam extends student
{
    int m1,m2,m3,m4,m5,m6;

    void marks()
    {

        enterinfo();

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter marks in subject 1: ");
        m1= obj.nextInt();
        System.out.println("Enter marks in subject 2: ");
        m2= obj.nextInt();
        System.out.println("Enter marks in subject 3: ");
        m3= obj.nextInt();
        System.out.println("Enter marks in subject 4: ");
        m4= obj.nextInt();
        System.out.println("Enter marks in subject 5: ");
        m5= obj.nextInt();
        System.out.println("Enter marks in subject 6: ");
        m6= obj.nextInt();
    }

}

public class exp8 extends exam
{
    void total()
    {
        int total= m1+m2+m3+m4+m5+m6;
        double avg= total/6;

        System.out.println("Total Marks: " +total);
        System.out.println("Average Marks: " +avg);
    }

    public static void main(String args[])
    {

        exp8 ob1= new exp8();
        ob1.marks();
        ob1.total();
    }
}