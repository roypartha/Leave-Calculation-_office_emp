import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("      Welcome Leave Software");
        System.out.println("----Create An Employee ---");

        Scanner input = new Scanner(System.in);


        System.out.println("Enter Employee Name:");
        String empName = input.nextLine();
        System.out.println(empName);

        System.out.println("Enter Employee Age:");
        int age = input.nextInt();

        System.out.println(" Employee Type:");
        System.out.println("1. Staff\n2. Non-Staff");
        System.out.println("Select Employee type:");
        int selectType = input.nextInt();
        String empType="";
        if (selectType == 1) {
            empType = "Staff";
        } else if (selectType == 2) {
            empType = "Non-Staff";
        }

        //Scanner input1 = new Scanner(System.in);
       // String hi = input1.nextLine();
        //System.out.println(hi);

        System.out.println("Enter Employee Join date(dd/mm/yy):");
        System.out.print("Day: ");
        int day = input.nextInt();
        System.out.print("Month: ");
        int moth = input.nextInt();
        System.out.print("Year: ");
        int year = input.nextInt();


       Employee emp = new Employee(empName,age,empType,day,moth,year);
       emp.leaveCalculation();
       emp.show();



    }
}
