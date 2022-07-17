package employee;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println("**EMPLOYERS**");
        int option=0;
        Scanner s=new Scanner(System.in);
        EmployeeMethods methodObject=new EmployeeMethods();
        while(true){
            System.out.println("1: Add\n2: Delete\n3: Display\n4: Count\n5: update\n6: Exit");
            System.out.println("Enter the option: ");
            option=s.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter the Id: ");
                    int id1=s.nextInt();
                    System.out.println("Enter the Name: ");
                    Scanner sc=new Scanner(System.in);
                    String name=sc.nextLine();
                    System.out.println("Enter the role: ");
                    String role=sc.nextLine();
                    System.out.println("Enter the Salary: ");
                    float salary=s.nextFloat();
                    System.out.println("Enter the Experience: ");
                    int exp=s.nextInt();
                    EmployeeDetails detailsObject=new EmployeeDetails(id1,name,role,salary,exp);
                    methodObject.add(detailsObject);
                    break;
                case 2:
                    System.out.println("Enter the Id: ");
                    int id2=s.nextInt();
                    methodObject.delete(id2);
                    break;
                case 3:
                    System.out.println("Available Employees");
                    methodObject.display();
                    break;
                case 4:
                    System.out.println("Total Number of Employees");
                    methodObject.count();
                    break;
                case 5:
                    System.out.println("Enter the Employee Id to be updated: ");
                    int id3=s.nextInt();
                    methodObject.update(id3);
                    break;
                case 6:
                    System.exit(0);
                    break;

            }
        }

    }
}
