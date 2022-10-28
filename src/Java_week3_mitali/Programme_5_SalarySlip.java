package Java_week3_mitali;

import java.util.Scanner;

public class Programme_5_SalarySlip {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name=scanner.nextLine();

        System.out.println("Enter your EmployeeID: ");
        int employeeId=scanner.nextInt();

        System.out.println("Enter Basic Salary: ");
        double basicSalary = scanner.nextInt();
        scanner.close();

        //Calculating HRA,DA,TA and PF
        double hRA=calculateHRA(basicSalary);
        double dA=calculateDA(basicSalary);
        double tA=calculateTA(basicSalary);
        double pF=calculatePF(basicSalary);

        //calculating the gross salary
        double grossSalary=basicSalary+hRA+dA+tA-pF;
        System.out.println("---------------------------------------");
        System.out.println("|Salary Slip                          |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Employee ID  :"+employeeId+"                   |");
        System.out.println("|Employee name:"+name+"                    |");
        System.out.println("|--------------------------------------|");
        System.out.println("|Basic Salary:"+basicSalary+"                  |");
        System.out.println("|HRA 10%     :"+hRA+"                  |");
        System.out.println("|TA   8%     :"+tA+"                   |");
        System.out.println("|DA   9%     :"+dA+"                   |");
        System.out.println("|PF   -20%   :"+pF+"                   |");
        System.out.println("|--------------------------------------|");
        System.out.println("|Gross Salary:"+grossSalary+"                 |");
        System.out.println("|--------------------------------------|");


    }

    //calculating HRA
    public static double calculateHRA(double basicSalary) {
        return (basicSalary * 10) / 100;
    }

    //Calculating DA
    public static double calculateDA(double basicSalary) {
        return (basicSalary * 8) / 100;
    }

    public static double calculateTA(double basicSalary) {
        return (basicSalary * 9) / 100;
    }

    public static double calculatePF(double basicSalary) {
        return (basicSalary * 20) / 100;
    }


}




















