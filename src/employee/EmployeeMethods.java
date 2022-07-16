package employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMethods {
    List<EmployeeDetails> employeeDetailsList=new ArrayList<EmployeeDetails>();
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
}
