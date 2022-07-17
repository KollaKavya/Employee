package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMethods {
    List<EmployeeDetails> employeeDetailsList=new ArrayList<EmployeeDetails>();
    Scanner s=new Scanner(System.in);
    public void add(EmployeeDetails details){
        int f=0;
        for(EmployeeDetails j:employeeDetailsList){
            if(j.getId()==details.getId()){
                f=1;
            }
        }
        if(f==0) {
            employeeDetailsList.add(details);
        }
        else{
            System.out.println("Id already Exists");
        }
    }

    public void delete(int deleteId){
        int f=0;
        for(EmployeeDetails j:employeeDetailsList){
            if(j.getId()==deleteId){
                employeeDetailsList.remove(j);
                System.out.println("Deleted Successfully");
                f=1;
                break;
            }
        }
        if(f==0){
            System.out.println("ID not Found");
        }
    }

    public void display(){
        for(EmployeeDetails j:employeeDetailsList){
            System.out.println(j.toString());
        }
    }

    public void count(){
        System.out.println(employeeDetailsList.size());
    }

    public void update(int id){
        EmployeeDetails check=find(id);
        int option;
        if(check!=null){
            System.out.println("1: Update Name\n2: Update Role\n3: Update Experience\n4: Update Salary\n5: Update All Details\n6: Exit");
            option=s.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter the Name: ");
                    Scanner s1=new Scanner(System.in);
                    String name=s1.nextLine();
                    check.setName(name);
                    break;
                case 2:
                    System.out.println("Enter the Role: ");
                    Scanner s2=new Scanner(System.in);
                    String role=s2.nextLine();
                    check.setRole(role);
                    break;
                case 3:
                    System.out.println("Enter the Experience: ");
                    int experience=s.nextInt();
                    check.setExperience(experience);
                    break;
                case 4:
                    System.out.println("Enter the Salary: ");
                    float salary=s.nextFloat();
                    check.setSalary(salary);
                    break;
                case 5:
                    System.out.println("Enter the Name: ");
                    Scanner s3=new Scanner(System.in);
                    String name1=s3.nextLine();
                    check.setName(name1);
                    System.out.println("Enter the Role: ");
                    Scanner s4=new Scanner(System.in);
                    String role1=s4.nextLine();
                    check.setRole(role1);
                    System.out.println("Enter the Experience: ");
                    int experience1=s.nextInt();
                    check.setExperience(experience1);
                    System.out.println("Enter the Salary: ");
                    float salary1=s.nextFloat();
                    check.setSalary(salary1);
                    break;
                case 6:
                    System.exit(0);
                    break;

            }
        }
    }

    public EmployeeDetails find(int id){
        for(EmployeeDetails j:employeeDetailsList){
            if(j.getId()==id){
                return j;
            }
        }
        return null;
    }
}
