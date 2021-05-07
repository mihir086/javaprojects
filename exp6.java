import java.util.Scanner;

public class exp6
{
    String Dep_name;
    String acc_type;
    float bal;

    Scanner get = new Scanner(System.in);

    void info()
    {
        System.out.println("Enter Depositor Name:");
        Dep_name = get.next();
        System.out.println("Enter Account Type:");
        acc_type = get.next();
        System.out.println("Enter Initial Balance:");
        bal = get.nextFloat();
    }

    void deposit()
    {
        float amount;
        System.out.println("Enter Amount to be Deposited:");
        amount = get.nextFloat();

        bal = bal+amount;
        System.out.println("Updated Account Balance is: " +bal);
    }

    void withdraw()
    {
        float amount;

        System.out.println("Enter Amount to be Withdrawn:");
        amount = get.nextFloat();

        if((bal-amount)<500)
        {
            System.out.println("Cannot withdraw");
        }
        else
        {
            bal= bal - amount;
        }
    }
    void display()
    {
        System.out.println("Depositor name is: " +Dep_name);
        System.out.println("Balance is: " +bal);
    }

    public static void main(String args[])
    {
        exp6 obj = new exp6();
        obj.info();
        obj.deposit();
        obj.withdraw();
        obj.display();
    }
}