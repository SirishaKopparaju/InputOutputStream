import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    private List<EmployeePayrollData> employeePayrollList;
    public EmployeePayrollService(){}
    public EmployeePayrollService(List<EmployeePayrollData>employeePayrollList){

    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData>employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        //employeePayrollService.writeEmployeePayrollData();

    }
    private void readEmployeePayrollData(Scanner consoleInputReader){
        System.out.println("employee id");
        int id = consoleInputReader.nextInt();
        System.out.println("employee name");
        String name = consoleInputReader.next();
        System.out.println("employee salary");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id,name,salary));

    }
    //private void writeEmployeePayrollData(){
        //System.out.println("\nwriting employee payroll roaster to console\n"+employeePayrollList);

    }
//}
